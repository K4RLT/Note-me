package a4;
import d.b;

import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import g5.q;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import q.x;

/* loaded from: classes.dex */
public final class g extends w {
    private static final g DEFAULT_INSTANCE;
    private static volatile v0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y strings_ = y0.f817x;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w.h(g.class, gVar);
    }

    public static void i(g gVar, Iterable iterable) {
        int i;
        y yVar = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) yVar).f677u) {
            int size = yVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            gVar.strings_ = yVar.h(i);
        }
        List list = gVar.strings_;
        Charset charset = z.f820a;
        if (iterable instanceof e0) {
            List j10 = ((e0) iterable).j();
            e0 e0Var = (e0) list;
            int size2 = list.size();
            for (Object obj : j10) {
                if (obj == null) {
                    String str = "Element at index " + (e0Var.size() - size2) + " is null.";
                    for (int size3 = e0Var.size() - 1; size3 >= size2; size3--) {
                        e0Var.remove(size3);
                    }
                    q.h(str);
                    return;
                }
                if (obj instanceof androidx.datastore.preferences.protobuf.g) {
                    e0Var.i((androidx.datastore.preferences.protobuf.g) obj);
                } else {
                    e0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof w0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                q.h(str2);
                return;
            }
            list.add(obj2);
        }
    }

    public static g j() {
        return DEFAULT_INSTANCE;
    }

    public static f l() {
        return (f) ((u) DEFAULT_INSTANCE.d(5));
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
                return new z0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                v0 v0Var2 = PARSER;
                if (v0Var2 == null) {
                    synchronized (g.class) {
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

    public final y k() {
        return this.strings_;
    }
}