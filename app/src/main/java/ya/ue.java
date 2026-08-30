package ya;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class ue {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb2;
        int i = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    if (sb4.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(sb4);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + sb4.length() + 9);
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb6 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb6.append((CharSequence) str, i11, indexOf);
            sb6.append(objArr[i]);
            i11 = indexOf + 2;
            i++;
        }
        sb6.append((CharSequence) str, i11, str.length());
        if (i < objArr.length) {
            sb6.append(" [");
            sb6.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb6.append(", ");
                sb6.append(objArr[i12]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }
}
