package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import l4.a;
import q.x;
import w2.a;
import w7.i1;
import x.n;
import x.o;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class gn {
    public static z2 b(z2 z2Var) {
        if (!(z2Var instanceof b3)) {
            if (z2Var instanceof a3) {
                return z2Var;
            }
            if (z2Var instanceof Serializable) {
                return new a3(z2Var);
            }
            return new b3(z2Var);
        }
        return z2Var;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "CANCELED";
            case 3:
                return "INVALID_REQUEST";
            case 4:
                return "HTTP_ERROR";
            case 5:
                return "REQUEST_ERROR";
            case 6:
                return "RESPONSE_OPEN_ERROR";
            case 7:
                return "RESPONSE_CLOSE_ERROR";
            case 8:
                return "NETWORK_IO_ERROR";
            case 9:
                return "DISK_IO_ERROR";
            case 10:
                return "FILE_SYSTEM_ERROR";
            case 11:
                return "UNKNOWN_IO_ERROR";
            default:
                return "null";
        }
    }

    public static String d(ls lsVar) {
        StringBuilder sb2 = new StringBuilder(lsVar.w());
        sb2.append("|");
        sb2.append(lsVar.D() - 1);
        return sb2.toString();
    }

    public static void e(Context context) {
        cx.c("%s: Setting migration to new file key to %s", "Migrations", Boolean.TRUE);
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static boolean f(int i) {
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, s9 s9Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(s9Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(s9Var) != obj && atomicReferenceFieldUpdater.get(s9Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, em emVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(emVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(emVar) != obj && atomicReferenceFieldUpdater.get(emVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static bn j() {
        String str;
        ClassLoader classLoader = gn.class.getClassLoader();
        if (!bn.class.equals(bn.class)) {
            if (!bn.class.getPackage().equals(gn.class.getPackage())) {
                q.x.n(bn.class.getName());
                return null;
            }
            str = w7.i1.d(bn.class.getPackage().getName(), ".BlazeGenerated", bn.class.getSimpleName(), "Loader");
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
                Iterator it = Arrays.asList(new gn[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(ym.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(bn.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (bn) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (bn) bn.class.getMethod("combine", Collection.class).invoke(null, arrayList);
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

    public static File k(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            File filesDir2 = context.getFilesDir();
            if (filesDir2 != null) {
                return filesDir2;
            }
            q.x.o("getFilesDir returned null twice.");
            return null;
        }
        return filesDir;
    }

    public static String l(ls lsVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(lsVar.x());
        sb2.append("|");
        sb2.append(lsVar.t());
        sb2.append("|");
        sb2.append(lsVar.w());
        sb2.append("|");
        sb2.append(lsVar.D() - 1);
        sb2.append("|");
        if (lsVar.C()) {
            str = Base64.encodeToString(lsVar.v().d(), 3);
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static ls m(Context context, String str) {
        ks u9;
        List b10 = w2.a("|").b(str);
        int ordinal = q(context).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (b10.size() == 4) {
                    u9 = ls.u();
                    String str2 = (String) b10.get(0);
                    u9.b();
                    ls.B((ls) u9.f14430v, str2);
                    long parseInt = Integer.parseInt((String) b10.get(1));
                    u9.b();
                    ls.y((ls) u9.f14430v, parseInt);
                    u9.l((String) b10.get(2));
                    u9.m(tl.i(Integer.parseInt((String) b10.get(3))));
                } else {
                    throw new Exception("Bad-format serializedFileKey = ".concat(str));
                }
            } else if (b10.size() == 2) {
                u9 = ls.u();
                u9.l((String) b10.get(0));
                u9.m(tl.i(Integer.parseInt((String) b10.get(1))));
            } else {
                throw new Exception("Bad-format serializedFileKey = s".concat(str));
            }
        } else if (b10.size() == 5) {
            u9 = ls.u();
            String str3 = (String) b10.get(0);
            u9.b();
            ls.B((ls) u9.f14430v, str3);
            long parseInt2 = Integer.parseInt((String) b10.get(1));
            u9.b();
            ls.y((ls) u9.f14430v, parseInt2);
            u9.l((String) b10.get(2));
            u9.m(tl.i(Integer.parseInt((String) b10.get(3))));
            if (b10.get(4) != null && !((String) b10.get(4)).isEmpty()) {
                try {
                    qq qqVar = (qq) nw.k((String) b10.get(4), qq.u());
                    u9.b();
                    ls.A((ls) u9.f14430v, qqVar);
                } catch (xn e) {
                    throw new Exception("Failed to deserialize key:".concat(str), e);
                }
            }
        } else {
            throw new Exception("Bad-format serializedFileKey = ".concat(str));
        }
        return (ls) u9.i();
    }

    public static Object o(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.get(arrayList.size() - 1);
        }
        l4.a.c();
        return null;
    }

    public static boolean p(Context context, av avVar) {
        cx.c("%s: Setting FileKeyVersion to %s", "Migrations", avVar.name());
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", avVar.f14040u).commit();
    }

    public static av q(Context context) {
        try {
            return av.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", 0));
        } catch (IllegalArgumentException unused) {
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return av.USE_CHECKSUM_ONLY;
        }
    }

    public static String s(ls lsVar, Context context) {
        int ordinal = q(context).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return d(lsVar);
                }
                throw new RuntimeException(null, null);
            }
            return l(lsVar);
        }
        StringBuilder sb2 = new StringBuilder(lsVar.x());
        sb2.append("|");
        sb2.append(lsVar.t());
        sb2.append("|");
        sb2.append(lsVar.w());
        sb2.append("|");
        sb2.append(lsVar.D() - 1);
        return sb2.toString();
    }

    public abstract int a();

    public abstract d6 i(int i);

    public abstract Object n(d6 d6Var);

    public abstract Object r(int i);
}
