package xa;
import n0.a;
import u0.b;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f30475a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30476b;

    public n0(ArrayList arrayList, HashMap hashMap) {
        this.f30475a = hashMap;
        this.f30476b = arrayList;
    }

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return a.k("Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ", cls.getName(), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        if (xa.b(r0[0]) != java.lang.String.class) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xa.c1 a(xa.k2 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.a(xa.k2, boolean):xa.c1");
    }

    public final String toString() {
        return this.f30475a.toString();
    }
}
