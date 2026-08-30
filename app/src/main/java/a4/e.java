package a4;
import d.b;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import q.x;

/* loaded from: classes.dex */
public final class e extends w {
    private static final e DEFAULT_INSTANCE;
    private static volatile v0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private n0 preferences_ = n0.f762v;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.h(e.class, eVar);
    }

    public static n0 i(e eVar) {
        n0 n0Var = eVar.preferences_;
        if (!n0Var.f763u) {
            eVar.preferences_ = n0Var.b();
        }
        return eVar.preferences_;
    }

    public static c k() {
        return (c) ((u) DEFAULT_INSTANCE.d(5));
    }

    public static e l(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n a10 = n.a();
        w wVar = (w) eVar.d(4);
        try {
            x0 x0Var = x0.f814c;
            x0Var.getClass();
            a1 a11 = x0Var.a(wVar.getClass());
            androidx.datastore.preferences.protobuf.i iVar = hVar.f722b;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i(hVar);
            }
            a11.h(wVar, iVar, a10);
            a11.b(wVar);
            if (wVar.g()) {
                return (e) wVar;
            }
            throw new IOException(new ab.b().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof b0) {
                throw ((b0) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof b0) {
                throw ((b0) e8.getCause());
            }
            throw e8;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, androidx.datastore.preferences.protobuf.v0] */
    @Override // androidx.datastore.preferences.protobuf.w
    public final Object d(int i) {
        v0 v0Var;
        switch (q0.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f244a});
            case 3:
                return new e();
            case 4:
                return new u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                v0 v0Var2 = PARSER;
                if (v0Var2 == null) {
                    synchronized (e.class) {
                        try {
                            v0 v0Var3 = PARSER;
                            v0Var = v0Var3;
                            if (v0Var3 == null) {
                                Object obj = new Object();
                                PARSER = obj;
                                v0Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return v0Var;
                }
                return v0Var2;
            default:
                x.h();
                return null;
        }
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}