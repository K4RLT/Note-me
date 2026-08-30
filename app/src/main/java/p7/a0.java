package p7;

import android.view.Choreographer;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f22423u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Set f22424v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f22425w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f22426x;

    public /* synthetic */ a0(d0 d0Var, Set set, boolean z3, int i) {
        this.f22423u = d0Var;
        this.f22424v = set;
        this.f22425w = z3;
        this.f22426x = i;
    }

    @Override // df.a
    public final Object invoke() {
        final Choreographer choreographer = Choreographer.getInstance();
        final d0 d0Var = this.f22423u;
        final e0 e0Var = d0Var.f22443a;
        final Set set = this.f22424v;
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: p7.b0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                final d0 d0Var2 = d0Var;
                final e0 e0Var2 = e0Var;
                final Set set2 = set;
                choreographer.postFrameCallback(new Choreographer.FrameCallback(d0Var2, e0Var2, set2) { // from class: p7.z

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ e0 f22614u;

                    /* renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ Set f22615v;

                    {
                        this.f22614u = e0Var2;
                        this.f22615v = set2;
                    }

                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j11) {
                        e0 e0Var3 = this.f22614u;
                        try {
                            e0Var3.f22472x.removeFinishedStrokes(this.f22615v);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        });
        if (this.f22425w) {
            e0Var.i.invoke(Integer.valueOf(this.f22426x));
        } else {
            e0Var.f22458j.invoke();
        }
        return pe.z.f22715a;
    }
}
