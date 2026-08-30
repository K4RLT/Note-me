package xa;
import q.f;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n1 extends i0 {
    public static final j1 e = new j1(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30477a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30478b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30479c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30480d;

    public n1(Class cls) {
        this.f30477a = 0;
        this.f30478b = new HashMap();
        this.f30479c = new HashMap();
        this.f30480d = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                l0 l0Var = (l0) field2.getAnnotation(l0.class);
                if (l0Var != null) {
                    name = l0Var.zza();
                    for (String str2 : l0Var.zzb()) {
                        ((HashMap) this.f30478b).put(str2, r42);
                    }
                }
                ((HashMap) this.f30478b).put(name, r42);
                ((HashMap) this.f30479c).put(str, r42);
                ((HashMap) this.f30480d).put(r42, name);
            }
        } catch (IllegalAccessException e8) {
            g5.f(e8);
            throw null;
        }
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        int i;
        switch (this.f30477a) {
            case 0:
                if (l2Var.c0() == 9) {
                    l2Var.Y();
                    return null;
                }
                String O = l2Var.O();
                Enum r02 = (Enum) ((HashMap) this.f30478b).get(O);
                if (r02 != null) {
                    return r02;
                }
                return (Enum) ((HashMap) this.f30479c).get(O);
            default:
                int c02 = l2Var.c0();
                if (c02 == 9) {
                    l2Var.Y();
                    return null;
                }
                Map map = (Map) ((c1) this.f30480d).zza();
                if (c02 == 1) {
                    l2Var.R();
                    while (l2Var.a0()) {
                        l2Var.R();
                        Object a10 = ((i2) this.f30478b).f30432b.a(l2Var);
                        if (map.put(a10, ((i2) this.f30479c).f30432b.a(l2Var)) == null) {
                            l2Var.W();
                        } else {
                            throw new ab.b("duplicate key: ".concat(String.valueOf(a10)), 21);
                        }
                    }
                    l2Var.W();
                } else {
                    l2Var.V();
                    while (l2Var.a0()) {
                        m1.f30465w.getClass();
                        int i10 = l2Var.B;
                        if (i10 == 0) {
                            i10 = l2Var.H();
                        }
                        if (i10 == 13) {
                            i = 9;
                        } else if (i10 == 12) {
                            i = 8;
                        } else if (i10 == 14) {
                            i = 10;
                        } else {
                            throw l2Var.g0("a name");
                        }
                        l2Var.B = i;
                        Object a11 = ((i2) this.f30478b).f30432b.a(l2Var);
                        if (map.put(a11, ((i2) this.f30479c).f30432b.a(l2Var)) != null) {
                            throw new ab.b("duplicate key: ".concat(String.valueOf(a11)), 21);
                        }
                    }
                    l2Var.X();
                }
                return map;
        }
    }

    public n1(l1 l1Var, i2 i2Var, i2 i2Var2, c1 c1Var) {
        this.f30477a = 1;
        this.f30478b = i2Var;
        this.f30479c = i2Var2;
        this.f30480d = c1Var;
    }
}
