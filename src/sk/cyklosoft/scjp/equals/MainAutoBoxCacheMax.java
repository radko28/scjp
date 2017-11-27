package sk.cyklosoft.scjp.equals;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
/**
 * 
 * VM param
 * -XX:AutoBoxCacheMax=size
 *
 */
public class MainAutoBoxCacheMax {

    public static void main(String[] args)  {
        
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        if(i1 != i2)
        System.out.println("different objects");
        
        Integer i3 = 10;
        Integer i4 = 10;
        if(i3 == i4)
        System.out.println("same objects");
        
        Integer i5 = 128;
        Integer i6 = 128;
        if(i5 != i6)
        System.out.printf("different objects %d %s\n",i5, getJVMParam());
        else System.out.printf("same objects %d %s\n",i5,getJVMParam());
        
        if(i5.intValue() != i6.intValue()) {
        } else { System.out.printf("same objects %d\n", i5);}
        
        
        String integerCacheHighPropValue = sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        System.out.printf("integerCacheHighPropValue: %s\n", integerCacheHighPropValue);                    
        
    }

    private static String getJVMParam() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> jvmArgs = runtimeMXBean.getInputArguments();
        String result = null;
        for (String arg : jvmArgs) {
            if(arg.contains("AutoBoxCacheMax")) {
                result =  arg;
                break;
            }
        }
        return result;
    }
}
