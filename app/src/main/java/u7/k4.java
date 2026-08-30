package u7;
import m7.g;
import k6.r;
import r0.a1;
import w7.m7;
import w7.n4;

import com.google.android.gms.internal.ads.gl;

/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26406u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f26407v;

    public /* synthetic */ k4(a1 a1Var, int i) {
        this.f26406u = i;
        this.f26407v = a1Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.a
    public final Object invoke() {
        boolean z3;
        switch (this.f26406u) {
            case 0:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 1:
                this.f26407v.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pe.z.f22715a;
            case 2:
                r(this.f26407v, false);
                return pe.z.f22715a;
            case 3:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 4:
                this.f26407v.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 5:
                this.f26407v.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 6:
                this.f26407v.setValue(Boolean.TRUE);
                return pe.z.f22715a;
            case 7:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 8:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 9:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 10:
                if (System.currentTimeMillis() - ((Number) this.f26407v.getValue()).longValue() < 250) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 11:
                n4.s0(this.f26407v, true);
                return pe.z.f22715a;
            case 12:
                n4.s0(this.f26407v, false);
                return pe.z.f22715a;
            case 13:
                n4.s0(this.f26407v, true);
                return pe.z.f22715a;
            case 14:
                n4.s0(this.f26407v, false);
                return pe.z.f22715a;
            case 15:
                n4.s0(this.f26407v, true);
                return pe.z.f22715a;
            case 16:
                n4.s0(this.f26407v, false);
                return pe.z.f22715a;
            case 17:
                n4.s0(this.f26407v, false);
                return pe.z.f22715a;
            case 18:
                this.f26407v.setValue(null);
                return pe.z.f22715a;
            case 19:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 20:
                m7.g(this.f26407v, true);
                return pe.z.f22715a;
            case gl.zzm /* 21 */:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 22:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 23:
                this.f26407v.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pe.z.f22715a;
            case 24:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 25:
                this.f26407v.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pe.z.f22715a;
            case 26:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 27:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            case 28:
                this.f26407v.setValue(Boolean.FALSE);
                return pe.z.f22715a;
            default:
                this.f26407v.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pe.z.f22715a;
        }
    }
}
