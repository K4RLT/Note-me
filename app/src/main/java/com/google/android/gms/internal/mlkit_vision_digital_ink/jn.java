package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public abstract class jn extends hn implements ho {
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.hn
    public final void c() {
        super.c();
        nn nnVar = this.f14430v;
        if (((kn) nnVar).zza != dn.f14194c) {
            kn knVar = (kn) nnVar;
            knVar.zza = knVar.zza.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.hn
    public final nn j() {
        boolean o10 = ((kn) this.f14430v).o();
        nn nnVar = this.f14430v;
        if (!o10) {
            return (kn) nnVar;
        }
        ((kn) nnVar).zza.d();
        return (kn) super.j();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.hn
    public final km k() {
        boolean o10 = ((kn) this.f14430v).o();
        nn nnVar = this.f14430v;
        if (!o10) {
            return (kn) nnVar;
        }
        ((kn) nnVar).zza.d();
        return (kn) super.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(mn mnVar, nn nnVar) {
        int i = nn.zzd;
        if (mnVar.f14671a == this.f14429u) {
            if (!this.f14430v.o()) {
                c();
            }
            dn dnVar = ((kn) this.f14430v).zza;
            boolean z3 = dnVar.f14196b;
            dn dnVar2 = dnVar;
            if (z3) {
                dn clone = dnVar.clone();
                ((kn) this.f14430v).zza = clone;
                dnVar2 = clone;
            }
            ln lnVar = mnVar.f14674d;
            Integer num = nnVar;
            if (lnVar.f14605v.f14377u == hp.B) {
                num = Integer.valueOf(((qn) nnVar).zza());
            }
            dnVar2.e(lnVar, num);
            return;
        }
        q.x.n("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}
