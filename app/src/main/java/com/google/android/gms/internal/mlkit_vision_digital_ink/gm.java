package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;

/* loaded from: classes.dex */
public final class gm extends em {
    public final /* synthetic */ hm B;

    public gm(hm hmVar) {
        this.B = hmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.em
    public final String b() {
        fm fmVar = (fm) this.B.f14427u.get();
        if (fmVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return p.a.k("tag=[", String.valueOf(fmVar.f14306a), "]");
    }
}
