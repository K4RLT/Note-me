package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public final /* synthetic */ class at implements m2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14030u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ tr f14031v;

    public /* synthetic */ at(tr trVar, int i) {
        this.f14030u = i;
        this.f14031v = trVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
    public final Object l(Object obj) {
        int i = this.f14030u;
        tr trVar = this.f14031v;
        switch (i) {
            case 0:
                return new dw(trVar, (tr) obj);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pr prVar = (pr) trVar.H().g();
                prVar.b();
                qr.C((qr) prVar.f14430v, booleanValue);
                qr qrVar = (qr) prVar.i();
                rr rrVar = (rr) trVar.g();
                rrVar.l(qrVar);
                return (tr) rrVar.i();
            default:
                Stream stream = ((List) obj).stream();
                final ix ixVar = new ix(trVar, 1);
                Collector collector = q3.f14834a;
                return (e5) stream.collect(Collector.of(new l3(3), new BiConsumer() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.p3
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        Collector collector2 = q3.f14834a;
                        ((j4) obj2).a((or) obj3, ix.this.apply(obj3));
                    }
                }, new m3(3), new n3(3), new Collector.Characteristics[0]));
        }
    }
}
