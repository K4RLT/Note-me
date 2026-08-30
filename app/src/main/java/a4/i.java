package a4;
import d.b;

import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.z0;
import q.x;

/* loaded from: classes.dex */
public final class i extends w {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile v0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        w.h(i.class, iVar);
    }

    public static void i(i iVar, long j10) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j10);
    }

    public static void j(i iVar, String str) {
        iVar.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void k(i iVar, f fVar) {
        iVar.getClass();
        iVar.value_ = fVar.a();
        iVar.valueCase_ = 6;
    }

    public static void l(i iVar, double d2) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d2);
    }

    public static void m(i iVar, boolean z3) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z3);
    }

    public static void n(i iVar, float f10) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f10);
    }

    public static void o(i iVar, int i) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i);
    }

    public static i q() {
        return DEFAULT_INSTANCE;
    }

    public static h y() {
        return (h) ((u) DEFAULT_INSTANCE.d(5));
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
                return new z0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 3:
                return new i();
            case 4:
                return new u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                v0 v0Var2 = PARSER;
                if (v0Var2 == null) {
                    synchronized (i.class) {
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

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final g w() {
        if (this.valueCase_ == 6) {
            return (g) this.value_;
        }
        return g.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}