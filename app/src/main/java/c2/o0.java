package c2;
import p1.b;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.ads.gl;
import ya.lc;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.m implements df.a {
    public static final o0 A;
    public static final o0 B;
    public static final o0 C;
    public static final o0 D;
    public static final o0 E;
    public static final o0 F;
    public static final o0 G;
    public static final o0 H;
    public static final o0 I;
    public static final o0 J;
    public static final o0 K;
    public static final o0 L;
    public static final o0 M;
    public static final o0 N;
    public static final o0 O;
    public static final o0 P;
    public static final o0 Q;
    public static final o0 R;
    public static final o0 S;
    public static final o0 T;
    public static final o0 U;
    public static final o0 V;
    public static final o0 W;
    public static final o0 X;

    /* renamed from: v, reason: collision with root package name */
    public static final o0 f3586v;

    /* renamed from: w, reason: collision with root package name */
    public static final o0 f3587w;

    /* renamed from: x, reason: collision with root package name */
    public static final o0 f3588x;

    /* renamed from: y, reason: collision with root package name */
    public static final o0 f3589y;

    /* renamed from: z, reason: collision with root package name */
    public static final o0 f3590z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3591u;

    static {
        int i = 0;
        f3586v = new o0(i, 0);
        f3587w = new o0(i, 1);
        f3588x = new o0(i, 2);
        f3589y = new o0(i, 3);
        f3590z = new o0(i, 4);
        A = new o0(i, 5);
        B = new o0(i, 6);
        C = new o0(i, 7);
        D = new o0(i, 8);
        E = new o0(i, 9);
        F = new o0(i, 10);
        G = new o0(i, 11);
        H = new o0(i, 12);
        I = new o0(i, 13);
        J = new o0(i, 14);
        K = new o0(i, 15);
        L = new o0(i, 16);
        M = new o0(i, 17);
        N = new o0(i, 18);
        O = new o0(i, 19);
        P = new o0(i, 20);
        Q = new o0(i, 21);
        R = new o0(i, 22);
        S = new o0(i, 23);
        T = new o0(i, 24);
        U = new o0(i, 25);
        V = new o0(i, 26);
        W = new o0(i, 27);
        X = new o0(i, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, int i10) {
        super(i);
        this.f3591u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        Choreographer choreographer;
        te.c cVar = null;
        switch (this.f3591u) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    wf.e eVar = pf.l0.f22767a;
                    choreographer = (Choreographer) pf.b0.C(uf.n.f27235a, new w0(2, cVar, 0));
                }
                y0 y0Var = new y0(choreographer, ya.z.a(Looper.getMainLooper()));
                return lc.c(y0Var, y0Var.F);
            case 6:
            case 7:
                return null;
            case 8:
                b("LocalAutofillManager");
                throw null;
            case 9:
                b("LocalAutofillTree");
                throw null;
            case 10:
                b("LocalClipboard");
                throw null;
            case 11:
                b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                b("LocalDensity");
                throw null;
            case 14:
                b("LocalFocusManager");
                throw null;
            case 15:
                b("LocalFontFamilyResolver");
                throw null;
            case 16:
                b("LocalFontLoader");
                throw null;
            case 17:
                b("LocalGraphicsContext");
                throw null;
            case 18:
                b("LocalHapticFeedback");
                throw null;
            case 19:
                b("LocalInputManager");
                throw null;
            case 20:
                b("LocalLayoutDirection");
                throw null;
            case gl.zzm /* 21 */:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                b("LocalTextToolbar");
                throw null;
            case 26:
                b("LocalUriHandler");
                throw null;
            case 27:
                b("LocalViewConfiguration");
                throw null;
            default:
                b("LocalWindowInfo");
                throw null;
        }
    }
}
