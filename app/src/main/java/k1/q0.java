package k1;
import a0.k0;
import k0.w;
import p.a;
import t0.b;

import b2.e2;
import z1.a1;

/* loaded from: classes.dex */
public final class q0 extends d1.q implements b2.x, e2 {
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public long O;
    public p0 P;
    public boolean Q;
    public long R;
    public long S;
    public int T;
    public k0 U;

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    @Override // b2.x
    public final z1.q0 c(z1.r0 r0Var, z1.o0 o0Var, long j10) {
        a1 z3 = o0Var.z(j10);
        return r0Var.u0(z3.f31769u, z3.f31770v, qe.t.f24024u, new w(z3, 4, this));
    }

    @Override // b2.e2
    public final boolean g() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.I);
        sb2.append(", scaleY=");
        sb2.append(this.J);
        sb2.append(", alpha = ");
        sb2.append(this.K);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.L);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.M);
        sb2.append(", cameraDistance=");
        sb2.append(this.N);
        sb2.append(", transformOrigin=");
        sb2.append((Object) b(this.O));
        sb2.append(", shape=");
        sb2.append(this.P);
        sb2.append(", clip=");
        sb2.append(this.Q);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        a.u(this.R, sb2, ", spotShadowColor=");
        a.u(this.S, sb2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) l0.K(this.T));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
    }
}
