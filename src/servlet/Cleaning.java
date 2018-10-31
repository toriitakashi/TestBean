package servlet;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Cleaning {

	private TestBean bean;

	public Cleaning(TestBean bean){
		this.bean = bean;
	}

	public void clean() throws ClassNotFoundException, IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		/* FIELDに対するアノテーションの取得 */
		Field fields[] = Class.forName(bean.getClass().getName()).getDeclaredFields();
		for(Field field : fields){
			for(Annotation annotation :  field.getAnnotations()){
				Size size = (Size)annotation;
				PropertyDescriptor prop = new PropertyDescriptor(field.getName(), bean.getClass());
				//Getter取得
				Method getter = prop.getReadMethod();
				//Setter取得
				Method setter = prop.getWriteMethod();
				String value = (String) getter.invoke(bean, (Object[]) null);
				//クリーニング
				if(size.max() < getSJISLength(value) ){
					setter.invoke(bean, value.substring(0, size.max()));
				}
			}
		}
	}

	private int getSJISLength(String str){
		if(str == null || str.equals(""))return 0;
		try {
			byte[] bytes = str.getBytes("MS932");
			return bytes.length;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
