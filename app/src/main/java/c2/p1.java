package c2;
import b2.v1;
import r0.c0;
import r0.m;
import r0.o2;
import r0.p1;
import r0.q1;
import r0.r;
import r0.y;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f3600a = new r0.p1(o0.B);

    /* renamed from: b, reason: collision with root package name */
    public static final o2 f3601b = new r0.p1(o0.C);

    /* renamed from: c, reason: collision with root package name */
    public static final o2 f3602c = new r0.p1(o0.E);

    /* renamed from: d, reason: collision with root package name */
    public static final o2 f3603d = new r0.p1(o0.D);
    public static final o2 e = new r0.p1(o0.G);

    /* renamed from: f, reason: collision with root package name */
    public static final o2 f3604f = new r0.p1(o0.F);

    /* renamed from: g, reason: collision with root package name */
    public static final o2 f3605g = new r0.p1(o0.M);

    /* renamed from: h, reason: collision with root package name */
    public static final o2 f3606h = new r0.p1(o0.I);
    public static final o2 i = new r0.p1(o0.J);

    /* renamed from: j, reason: collision with root package name */
    public static final o2 f3607j = new r0.p1(o0.L);

    /* renamed from: k, reason: collision with root package name */
    public static final o2 f3608k = new r0.p1(o0.K);

    /* renamed from: l, reason: collision with root package name */
    public static final o2 f3609l = new r0.p1(o0.N);

    /* renamed from: m, reason: collision with root package name */
    public static final o2 f3610m = new r0.p1(o0.O);

    /* renamed from: n, reason: collision with root package name */
    public static final o2 f3611n = new r0.p1(o0.P);

    /* renamed from: o, reason: collision with root package name */
    public static final o2 f3612o = new r0.p1(o0.T);

    /* renamed from: p, reason: collision with root package name */
    public static final o2 f3613p = new r0.p1(o0.S);

    /* renamed from: q, reason: collision with root package name */
    public static final o2 f3614q = new r0.p1(o0.U);

    /* renamed from: r, reason: collision with root package name */
    public static final o2 f3615r = new r0.p1(o0.V);

    /* renamed from: s, reason: collision with root package name */
    public static final o2 f3616s = new r0.p1(o0.W);

    /* renamed from: t, reason: collision with root package name */
    public static final o2 f3617t = new r0.p1(o0.X);

    /* renamed from: u, reason: collision with root package name */
    public static final o2 f3618u = new r0.p1(o0.Q);

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f3619v = new c0(o0.R);

    /* renamed from: w, reason: collision with root package name */
    public static final o2 f3620w = new r0.p1(o0.H);

    public static final void a(v1 v1Var, b1 b1Var, df.p pVar, m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1925803616);
        if (rVar.f(v1Var)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i10 | i11;
        if (rVar.f(b1Var)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i15 = i14 | i12;
        if (rVar.h(pVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i16 = i15 | i13;
        if ((i16 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i16 & 1, z3)) {
            x xVar = (x) v1Var;
            k9.z a10 = f3600a.a(xVar.getAccessibilityManager());
            k9.z a11 = f3601b.a(xVar.getAutofill());
            k9.z a12 = f3603d.a(xVar.getAutofillManager());
            k9.z a13 = f3602c.a(xVar.getAutofillTree());
            k9.z a14 = e.a(xVar.m195getClipboardManager());
            k9.z a15 = f3604f.a(xVar.m194getClipboard());
            k9.z a16 = f3606h.a(xVar.getDensity());
            k9.z a17 = i.a(xVar.getFocusOwner());
            k9.z a18 = f3607j.a(xVar.getFontLoader());
            a18.f19733c = false;
            k9.z a19 = f3608k.a(xVar.getFontFamilyResolver());
            a19.f19733c = false;
            y.b(new k9.z[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, f3609l.a(xVar.getHapticFeedBack()), f3610m.a(xVar.getInputModeManager()), f3611n.a(xVar.getLayoutDirection()), f3612o.a(xVar.getTextInputService()), f3613p.a(xVar.getSoftwareKeyboardController()), f3614q.a(xVar.getTextToolbar()), f3615r.a(b1Var), f3616s.a(xVar.getViewConfiguration()), f3617t.a(xVar.getWindowInfo()), f3618u.a(xVar.getPointerIconService()), f3605g.a(xVar.getGraphicsContext())}, pVar, rVar, ((i16 >> 3) & 112) | 8);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new q0(v1Var, b1Var, pVar, i10, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final o2 c() {
        return f3606h;
    }
}
