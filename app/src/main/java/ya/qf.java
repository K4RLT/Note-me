package ya;

import com.google.android.gms.internal.mlkit_vision_digital_ink.ql;

/* loaded from: classes.dex */
public abstract class qf {

    /* renamed from: a, reason: collision with root package name */
    public static ql f31468a;

    public static synchronized pf a() {
        pf pfVar;
        synchronized (qf.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                Object obj = new Object();
                synchronized (qf.class) {
                    try {
                        if (f31468a == null) {
                            f31468a = new ql(3);
                        }
                        pfVar = (pf) f31468a.l(obj);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return pfVar;
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" enableFirelog");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" firelogEventType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return pfVar;
    }
}
