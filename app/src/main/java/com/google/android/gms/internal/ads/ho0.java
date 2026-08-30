package com.google.android.gms.internal.ads;
import a0.k;
import ib.a;
import ib.o;
import j9.m;
import k9.a0;
import q.x;
import w9.a;

import android.os.Handler;
import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class ho0 implements so0, s81, ib.a, r31, p31, wd1, td1, md1, xc1, vc1, od1 {
    public static final /* synthetic */ ho0 A;
    public static final /* synthetic */ ho0 B;
    public static final /* synthetic */ ho0 C;
    public static final /* synthetic */ ho0 D;
    public static final /* synthetic */ ho0 E;
    public static final /* synthetic */ ho0 F;
    public static final /* synthetic */ ho0 G;
    public static final /* synthetic */ ho0 H;
    public static final /* synthetic */ ho0 I;
    public static final /* synthetic */ ho0 J;
    public static final /* synthetic */ ho0 K;
    public static final /* synthetic */ ho0 L;
    public static final /* synthetic */ ho0 M;
    public static final /* synthetic */ ho0 N;
    public static final /* synthetic */ ho0 O;
    public static final /* synthetic */ ho0 P;
    public static final /* synthetic */ ho0 Q;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ ho0 f6848v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ho0 f6849w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ho0 f6850x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ ho0 f6851y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ ho0 f6852z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6853u;

    static {
        byte b10 = 0;
        f6848v = new ho0(0, b10);
        f6849w = new ho0(1, b10);
        f6850x = new ho0(2, b10);
        f6851y = new ho0(4, b10);
        f6852z = new ho0(5, b10);
        A = new ho0(6, b10);
        B = new ho0(7, b10);
        C = new ho0(14, b10);
        D = new ho0(16, b10);
        E = new ho0(17, b10);
        F = new ho0(18, b10);
        G = new ho0(19, b10);
        H = new ho0(20, b10);
        I = new ho0(21, b10);
        J = new ho0(22, b10);
        K = new ho0(23, b10);
        L = new ho0(24, b10);
        M = new ho0(25, b10);
        N = new ho0(26, b10);
        O = new ho0(27, b10);
        P = new ho0(28, b10);
        Q = new ho0(29, b10);
    }

    public ho0(int i) {
        this.f6853u = 10;
    }

    @Override // com.google.android.gms.internal.ads.td1, com.google.android.gms.internal.ads.xc1
    public Object a(xy xyVar) {
        switch (this.f6853u) {
            case 16:
                cd1 cd1Var = (cd1) xyVar;
                yd1 yd1Var = cd1Var.P;
                Object obj = yd1Var.f12858x;
                return new bc1((o91) tc1.f11325d.b(o91.class, (String) yd1Var.f12855u).a((om1) yd1Var.f12857w), ed1.f((x91) yd1Var.f12859y, (Integer) cd1Var.P.f12860z).b());
            case 17:
                return wk1.b((fa1) xyVar);
            case 18:
                return sk1.b((la1) xyVar);
            case 19:
                pa1 pa1Var = (pa1) xyVar;
                pa1Var.getClass();
                return new bc1(((gl1) pa1Var.Q.f4819v).b(), pa1Var.R);
            case 20:
                return jc1.b((sa1) xyVar);
            case gl.zzm /* 21 */:
                va1 va1Var = (va1) xyVar;
                sd1 sd1Var = wa1.f12204a;
                try {
                    vb1.b();
                    return new vb1(((gl1) va1Var.Q.f4819v).b(), va1Var.R.b(), vb1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new bc1(2, ((gl1) va1Var.Q.f4819v).b(), va1Var.R.b());
                }
            case 22:
                sd1 sd1Var2 = ya1.f12835a;
                t91.a(((ab1) xyVar).P.f4757a);
                throw null;
            default:
                ad1 ad1Var = za1.f13131a;
                t91.a(((db1) xyVar).P.f5641b);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 b(v91 v91Var) {
        bb1 bb1Var = (bb1) v91Var;
        nd1 nd1Var = cb1.f5070a;
        x91 a10 = cb1.a(bb1Var.f4758b);
        uh1 B2 = vh1.B();
        String str = bb1Var.f4757a;
        B2.b();
        ((vh1) B2.f4845v).D(str);
        return zd1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", a10, ((vh1) B2.c()).a());
    }

    @Override // com.google.android.gms.internal.ads.md1
    public v91 c(zd1 zd1Var) {
        w91 w91Var;
        switch (this.f6853u) {
            case 24:
                nd1 nd1Var = cb1.f5070a;
                ih1 ih1Var = (ih1) zd1Var.f13143w;
                if (ih1Var.z().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        om1 A2 = ih1Var.A();
                        wm1 wm1Var = wm1.f12302a;
                        int i = em1.f5727a;
                        String z3 = vh1.A(A2, wm1.f12303b).z();
                        x91 x91Var = (x91) zd1Var.f13144x;
                        if (x91Var == x91.f12505d) {
                            w91Var = w91.f12184k;
                        } else if (x91Var == x91.f12506f) {
                            w91Var = w91.f12185l;
                        } else {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
                        }
                        return new bb1(z3, w91Var);
                    } catch (pn1 e) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                    }
                }
                q.x.n("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var.z())));
                return null;
            default:
                nd1 nd1Var2 = gb1.f6361a;
                ih1 ih1Var2 = (ih1) zd1Var.f13143w;
                if (ih1Var2.z().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        om1 A3 = ih1Var2.A();
                        wm1 wm1Var2 = wm1.f12302a;
                        int i10 = em1.f5727a;
                        return gb1.c(zh1.B(A3, wm1.f12303b), (x91) zd1Var.f13144x);
                    } catch (pn1 e8) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
                    }
                }
                q.x.n("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ih1Var2.z())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public xy d(yd1 yd1Var) {
        w91 w91Var;
        nd1 nd1Var = cb1.f5070a;
        if (((String) yd1Var.f12855u).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                om1 om1Var = (om1) yd1Var.f12857w;
                wm1 wm1Var = wm1.f12302a;
                int i = em1.f5727a;
                th1 B2 = th1.B(om1Var, wm1.f12303b);
                if (B2.z() == 0) {
                    String z3 = B2.A().z();
                    x91 x91Var = (x91) yd1Var.f12859y;
                    if (x91Var == x91.f12505d) {
                        w91Var = w91.f12184k;
                    } else if (x91Var == x91.f12506f) {
                        w91Var = w91.f12185l;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
                    }
                    return ab1.h0(new bb1(z3, w91Var), (Integer) yd1Var.f12860z);
                }
                String valueOf = String.valueOf(B2);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("KmsAeadKey are only accepted with version 0, got ");
                sb2.append(valueOf);
                throw new GeneralSecurityException(sb2.toString());
            } catch (pn1 e) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
            }
        }
        q.x.n("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wd1
    public Object e(s91 s91Var) {
        xy xyVar = s91Var.f10566a;
        if (xyVar instanceof fa1) {
            return wk1.b((fa1) xyVar);
        }
        if (xyVar instanceof pa1) {
            pa1 pa1Var = (pa1) xyVar;
            return new bc1(((gl1) pa1Var.Q.f4819v).b(), pa1Var.R);
        }
        if (xyVar instanceof sa1) {
            return jc1.b((sa1) xyVar);
        }
        if (xyVar instanceof la1) {
            return sk1.b((la1) xyVar);
        }
        if (xyVar instanceof va1) {
            va1 va1Var = (va1) xyVar;
            gl1 gl1Var = va1Var.R;
            bl0 bl0Var = va1Var.Q;
            try {
                vb1.b();
                return new vb1(((gl1) bl0Var.f4819v).b(), gl1Var.b(), vb1.b().getProvider());
            } catch (GeneralSecurityException unused) {
                return new bc1(2, ((gl1) bl0Var.f4819v).b(), gl1Var.b());
            }
        }
        if (xyVar instanceof lb1) {
            lb1 lb1Var = (lb1) xyVar;
            gl1 gl1Var2 = lb1Var.R;
            bl0 bl0Var2 = lb1Var.Q;
            try {
                vb1.b();
                return new gc1(((gl1) bl0Var2.f4819v).b(), gl1Var2.b(), vb1.b().getProvider());
            } catch (GeneralSecurityException unused2) {
                return new bc1(3, ((gl1) bl0Var2.f4819v).b(), gl1Var2.b());
            }
        }
        if (xyVar instanceof ib1) {
            ib1 ib1Var = (ib1) xyVar;
            return new ec1(((gl1) ib1Var.Q.f4819v).b(), ib1Var.R, ib1Var.P.f7712b);
        }
        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(xyVar.getClass())));
    }

    @Override // com.google.android.gms.internal.ads.p31
    public Iterator f(mf mfVar, CharSequence charSequence) {
        return new o31(mfVar, charSequence);
    }

    @Override // ib.a
    public /* synthetic */ Object g(ib.o oVar) {
        return new Boolean(oVar.l());
    }

    @Override // com.google.android.gms.internal.ads.so0
    public /* synthetic */ void l(Object obj) {
        switch (this.f6853u) {
            case 0:
                ((p70) obj).h();
                return;
            case 1:
                ((j9.m) obj).u2();
                return;
            case 2:
                ((j9.m) obj).o3();
                return;
            case 3:
            default:
                ((w9.a) obj).l();
                return;
            case 4:
                ((zv) obj).i();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public /* synthetic */ void mo202r(Object obj) {
        k9.a0.k("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        k9.a0.k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.r31
    public /* synthetic */ Object zza() {
        switch (this.f6853u) {
            case 7:
                return -1;
            case 8:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    public /* synthetic */ ho0(int i, byte b10) {
        this.f6853u = i;
    }

    @Override // com.google.android.gms.internal.ads.td1, com.google.android.gms.internal.ads.xc1
    public yd1 a(xy xyVar) {
        switch (this.f6853u) {
            case 25:
                ab1 ab1Var = (ab1) xyVar;
                nd1 nd1Var = cb1.f5070a;
                sh1 C2 = th1.C();
                uh1 B2 = vh1.B();
                String str = ab1Var.P.f4757a;
                B2.b();
                ((vh1) B2.f4845v).D(str);
                vh1 vh1Var = (vh1) B2.c();
                C2.b();
                ((th1) C2.f4845v).E(vh1Var);
                return yd1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((th1) C2.c()).a(), w91.f12181g, cb1.a(ab1Var.P.f4758b), ab1Var.R);
            default:
                db1 db1Var = (db1) xyVar;
                nd1 nd1Var2 = gb1.f6361a;
                wh1 C3 = xh1.C();
                zh1 b10 = gb1.b(db1Var.P);
                C3.b();
                ((xh1) C3.f4845v).E(b10);
                return yd1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((xh1) C3.c()).a(), w91.f12181g, gb1.a(db1Var.P.f5640a), db1Var.R);
        }
    }
}
