package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l0 {
    static {
        nq w10 = oq.w();
        hq t3 = hq.t();
        w10.b();
        oq.y((oq) w10.f14430v, t3);
        nq w11 = oq.w();
        lq t10 = lq.t();
        w11.b();
        oq.z((oq) w11.f14430v, t10);
        nq w12 = oq.w();
        mq t11 = mq.t();
        w12.b();
        oq.A((oq) w12.f14430v, t11);
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.b4, com.google.android.gms.internal.mlkit_vision_digital_ink.d4] */
    public static String a(qq qqVar) {
        String str;
        String str2;
        e4 e4Var = h4.f14393v;
        n5.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        for (oq oqVar : qqVar.y()) {
            int F = oqVar.F();
            int i10 = F - 1;
            if (F != 0) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        str = "defrag";
                                    } else {
                                        q.x.n("No transform specified");
                                        return null;
                                    }
                                } else {
                                    jq t3 = oqVar.t();
                                    if (t3.t() > 0) {
                                        b4 b4Var = new b4(4);
                                        for (iq iqVar : t3.w()) {
                                            pa.p(iqVar.v());
                                            if (iqVar.w()) {
                                                b4Var.a(iqVar.t() + "=" + b(iqVar.u()));
                                            } else {
                                                b4Var.a(iqVar.t());
                                            }
                                        }
                                        e4 listIterator = b4Var.d().listIterator(0);
                                        StringBuilder sb2 = new StringBuilder();
                                        f7.i(sb2, listIterator, ",");
                                        str2 = p.a.k("(", sb2.toString(), ")");
                                    } else {
                                        str2 = "";
                                    }
                                    str = String.valueOf(t3.v()).concat(str2);
                                }
                            } else {
                                sq x9 = oqVar.x();
                                pa.p(x9.x());
                                str = p.a.k("zip(target=", b(x9.v()), ")");
                            }
                        } else {
                            mq v2 = oqVar.v();
                            if (v2.v()) {
                                str = p.a.k("integrity(sha256=", b(v2.u()), ")");
                            } else {
                                str = "integrity";
                            }
                        }
                    } else {
                        lq u9 = oqVar.u();
                        if (u9.x()) {
                            str = p.a.k("encrypt(aes_gcm_key=", b(u9.v()), ")");
                        } else if (u9.w()) {
                            str = p.a.k("encrypt(aes_gcm_hkdf_key=", b(u9.u()), ")");
                        } else {
                            str = "encrypt";
                        }
                    }
                } else {
                    str = "compress";
                }
                int length = objArr.length;
                int i11 = i + 1;
                int b10 = b4.b(length, i11);
                if (b10 > length) {
                    objArr = Arrays.copyOf(objArr, b10);
                }
                objArr[i] = str;
                i = i11;
            } else {
                throw null;
            }
        }
        return e0.a(h4.r(objArr, i));
    }

    public static final String b(String str) {
        try {
            return URLEncoder.encode(str, b0.f14047a.displayName());
        } catch (UnsupportedEncodingException e) {
            androidx.datastore.preferences.protobuf.s1.r(e);
            return null;
        }
    }
}
