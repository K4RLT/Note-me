package b0;
import b0.b;
import b0.i1;
import b0.j1;
import t0.e;

import android.view.Choreographer;
import android.view.View;
import r0.v1;

/* loaded from: classes.dex */
public final class b implements j1, v1, Runnable, Choreographer.FrameCallback {
    public static long A;

    /* renamed from: u, reason: collision with root package name */
    public final View f1146u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1148w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1150y;

    /* renamed from: z, reason: collision with root package name */
    public long f1151z;

    /* renamed from: v, reason: collision with root package name */
    public final e f1147v = new e(new i1[16]);

    /* renamed from: x, reason: collision with root package name */
    public final Choreographer f1149x = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f1146u = r5
            e r0 = new e
            r1 = 16
            i1[] r1 = new i1[r1]
            r0.<init>(r1)
            r4.f1147v = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f1149x = r0
            long r0 = b0.b.A
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            b0.b.A = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.<init>(android.view.View):void");
    }

    @Override // v1
    public final void b() {
        this.f1150y = false;
        this.f1146u.removeCallbacks(this);
        this.f1149x.removeFrameCallback(this);
    }

    @Override // j1
    public final void c(i1 i1Var) {
        this.f1147v.b(i1Var);
        if (!this.f1148w) {
            this.f1148w = true;
            this.f1146u.post(this);
        }
    }

    @Override // v1
    public final void d() {
        this.f1150y = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.f1150y) {
            this.f1151z = j10;
            this.f1146u.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f1147v;
        if (eVar.f25619w != 0 && this.f1148w && this.f1150y && this.f1146u.getWindowVisibility() == 0) {
            a aVar = new a(this.f1151z + A, 0);
            boolean z3 = false;
            while (eVar.f25619w != 0 && !z3) {
                if (Math.max(0L, aVar.f1139v - System.nanoTime()) <= 0 || ((i1) eVar.f25617u[0]).b(aVar)) {
                    z3 = true;
                } else {
                    eVar.n(0);
                }
            }
            if (z3) {
                this.f1149x.postFrameCallback(this);
                return;
            } else {
                this.f1148w = false;
                return;
            }
        }
        this.f1148w = false;
    }

    @Override // v1
    public final void a() {
    }
}
