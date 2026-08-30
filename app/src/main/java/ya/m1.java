package ya;

/* loaded from: classes.dex */
public abstract class m1 {
    public static boolean a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Boolean bool = (Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, str, Boolean.FALSE);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Integer num = (Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, 0);
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
