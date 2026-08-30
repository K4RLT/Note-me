package pf;
import a.a;
import b0.o;

/* loaded from: classes.dex */
public abstract class v extends te.a implements te.e {

    /* renamed from: v, reason: collision with root package name */
    public static final u f22800v = new u(te.d.f25706u, new m2.f0(11));

    public v() {
        super(te.d.f25706u);
    }

    @Override // te.a, te.g
    public final te.e L(te.f fVar) {
        te.e eVar;
        fVar.getClass();
        if (fVar instanceof u) {
            u uVar = (u) fVar;
            te.f fVar2 = this.f25703u;
            if ((fVar2 == uVar || uVar.f22797v == fVar2) && (eVar = (te.e) uVar.f22796u.invoke(this)) != null) {
                return eVar;
            }
        } else if (te.d.f25706u == fVar) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (((te.e) r3.f22796u.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        return te.h.f25707u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (te.d.f25706u == r3) goto L15;
     */
    @Override // te.a, te.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final te.g N(te.f r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof pf.u
            if (r0 == 0) goto L1e
            pf.u r3 = (pf.u) r3
            te.f r0 = r2.f25703u
            if (r0 == r3) goto L13
            te.f r1 = r3.f22797v
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            df.l r3 = r3.f22796u
            java.lang.Object r3 = r3.invoke(r2)
            te.e r3 = (te.e) r3
            if (r3 == 0) goto L25
            goto L22
        L1e:
            te.d r0 = te.d.f25706u
            if (r0 != r3) goto L25
        L22:
            te.h r3 = te.h.f25707u
            return r3
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v.N(te.f):te.g");
    }

    public abstract void W(te.g gVar, Runnable runnable);

    public void X(te.g gVar, Runnable runnable) {
        W(gVar, runnable);
    }

    public boolean Y(te.g gVar) {
        return !(this instanceof y1);
    }

    public v Z(int i) {
        uf.a(i);
        return new uf.h(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + o(this);
    }
}
