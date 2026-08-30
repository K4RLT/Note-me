package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class y4 {
    public static d a(d dVar, j6.n nVar, o oVar, Boolean bool, Boolean bool2) {
        d dVar2 = new d();
        Iterator w10 = dVar.w();
        while (w10.hasNext()) {
            int intValue = ((Integer) w10.next()).intValue();
            if (dVar.v(intValue)) {
                n e = oVar.e(nVar, Arrays.asList(dVar.p(intValue), new g(Double.valueOf(intValue)), dVar));
                if (e.k().equals(bool)) {
                    break;
                }
                if (bool2 == null || e.k().equals(bool2)) {
                    dVar2.u(intValue, e);
                }
            }
        }
        return dVar2;
    }

    public static n b(d dVar, j6.n nVar, ArrayList arrayList, boolean z3) {
        n nVar2;
        int i;
        int i10;
        int i11;
        o0.k(1, "reduce", arrayList);
        o0.n(2, "reduce", arrayList);
        n k3 = ((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(0));
        if (k3 instanceof j) {
            if (arrayList.size() == 2) {
                nVar2 = ((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(1));
                if (nVar2 instanceof h) {
                    q.x.n("Failed to parse initial value");
                    return null;
                }
            } else if (dVar.r() != 0) {
                nVar2 = null;
            } else {
                q.x.o("Empty array with no initial value error");
                return null;
            }
            j jVar = (j) k3;
            int r8 = dVar.r();
            if (z3) {
                i = 0;
            } else {
                i = r8 - 1;
            }
            if (z3) {
                i10 = r8 - 1;
            } else {
                i10 = 0;
            }
            if (z3) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            if (nVar2 == null) {
                nVar2 = dVar.p(i);
                i += i11;
            }
            while ((i10 - i) * i11 >= 0) {
                if (dVar.v(i)) {
                    nVar2 = jVar.e(nVar, Arrays.asList(nVar2, dVar.p(i), new g(Double.valueOf(i)), dVar));
                    if (nVar2 instanceof h) {
                        q.x.o("Reduce operation failed");
                        return null;
                    }
                    i += i11;
                } else {
                    i += i11;
                }
            }
            return nVar2;
        }
        q.x.n("Callback should be a method");
        return null;
    }

    public static n c(t3 t3Var) {
        if (t3Var == null) {
            return n.f13848h;
        }
        int i = q4.f13888a[q0.d.b(t3Var.q())];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            q.x.o("Invalid entity: ".concat(String.valueOf(t3Var)));
                            return null;
                        }
                        q.x.n("Unknown type found. Cannot convert entity");
                        return null;
                    }
                    List t3 = t3Var.t();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = t3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c((t3) it.next()));
                    }
                    return new q(t3Var.r(), arrayList);
                }
                if (t3Var.v()) {
                    return new e(Boolean.valueOf(t3Var.u()));
                }
                return new e(null);
            }
            if (t3Var.w()) {
                return new g(Double.valueOf(t3Var.p()));
            }
            return new g(null);
        }
        if (t3Var.x()) {
            return new p(t3Var.s());
        }
        return n.f13854o;
    }

    public static n d(Object obj) {
        if (obj == null) {
            return n.i;
        }
        if (obj instanceof String) {
            return new p((String) obj);
        }
        if (obj instanceof Double) {
            return new g((Double) obj);
        }
        if (obj instanceof Long) {
            return new g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new e((Boolean) obj);
        }
        if (obj instanceof Map) {
            m mVar = new m();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                n d2 = d(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    mVar.g((String) obj2, d2);
                }
            }
            return mVar;
        }
        if (obj instanceof List) {
            d dVar = new d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.q(d(it.next()));
            }
            return dVar;
        }
        q.x.n("Invalid value type");
        return null;
    }

    public static v4 e() {
        String str;
        ClassLoader classLoader = y4.class.getClassLoader();
        if (!v4.class.equals(v4.class)) {
            if (!v4.class.getPackage().equals(y4.class.getPackage())) {
                q.x.n(v4.class.getName());
                return null;
            }
            str = w7.i1.d(v4.class.getPackage().getName(), ".BlazeGenerated", v4.class.getSimpleName(), "Loader");
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    try {
                        a5.a.p(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new y4[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(t4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(v4.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (v4) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (v4) v4.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e13) {
                    androidx.datastore.preferences.protobuf.s1.r(e13);
                    return null;
                } catch (NoSuchMethodException e14) {
                    androidx.datastore.preferences.protobuf.s1.r(e14);
                    return null;
                } catch (InvocationTargetException e15) {
                    androidx.datastore.preferences.protobuf.s1.r(e15);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
