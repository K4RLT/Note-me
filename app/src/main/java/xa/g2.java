package xa;
import p.a;

import com.google.android.gms.internal.ads.wd0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f30419a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xa.u0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        Object r02;
        try {
            r02 = new f2();
        } catch (ReflectiveOperationException unused) {
            r02 = new Object();
        }
        f30419a = r02;
    }

    public static String a(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        f(constructor, sb2);
        return sb2.toString();
    }

    public static String b(Field field) {
        return wd0.n(field.getDeclaringClass().getName(), "#", field.getName());
    }

    public static String c(AccessibleObject accessibleObject, boolean z3) {
        String concat;
        if (accessibleObject instanceof Field) {
            concat = a.k("field '", b((Field) accessibleObject), "'");
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            f(method, sb2);
            concat = a5.a.h("method '", method.getDeclaringClass().getName(), "#", sb2.toString(), "'");
        } else if (accessibleObject instanceof Constructor) {
            concat = a.k("constructor '", a((Constructor) accessibleObject), "'");
        } else {
            concat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (z3 && Character.isLowerCase(concat.charAt(0))) {
            return Character.toUpperCase(concat.charAt(0)) + concat.substring(1);
        }
        return concat;
    }

    public static void d(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new ab.b(21, a.l("Failed making ", c(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e(e)), e);
        }
    }

    public static String e(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str));
        }
        return "";
    }

    public static void f(AccessibleObject accessibleObject, StringBuilder sb2) {
        Class<?>[] parameterTypes;
        sb2.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i].getSimpleName());
        }
        sb2.append(')');
    }
}