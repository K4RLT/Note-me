package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.function.BiConsumer;
import java.util.stream.Collector;

/* loaded from: classes.dex */
public abstract class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f14834a;

    static {
        final int i = 0;
        f14834a = Collector.of(new l3(0), new BiConsumer() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.o3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((d4) obj).a(obj2);
                        return;
                    case 1:
                        m4 m4Var = (m4) obj;
                        m4Var.getClass();
                        obj2.getClass();
                        m4Var.a(obj2);
                        return;
                    default:
                        k4 k4Var = (k4) obj;
                        y4 y4Var = (y4) obj2;
                        k4Var.getClass();
                        pa.q(!y4Var.f15273u.equals(y4Var.f15274v), "range must not be empty, but was %s", y4Var);
                        k4Var.f14543a.add(y4Var);
                        return;
                }
            }
        }, new m3(1), new n3(1), new Collector.Characteristics[0]);
        final int i10 = 1;
        Collector.of(new l3(1), new BiConsumer() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.o3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((d4) obj).a(obj2);
                        return;
                    case 1:
                        m4 m4Var = (m4) obj;
                        m4Var.getClass();
                        obj2.getClass();
                        m4Var.a(obj2);
                        return;
                    default:
                        k4 k4Var = (k4) obj;
                        y4 y4Var = (y4) obj2;
                        k4Var.getClass();
                        pa.q(!y4Var.f15273u.equals(y4Var.f15274v), "range must not be empty, but was %s", y4Var);
                        k4Var.f14543a.add(y4Var);
                        return;
                }
            }
        }, new m3(2), new n3(2), new Collector.Characteristics[0]);
        final int i11 = 2;
        Collector.of(new l3(2), new BiConsumer() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.o3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((d4) obj).a(obj2);
                        return;
                    case 1:
                        m4 m4Var = (m4) obj;
                        m4Var.getClass();
                        obj2.getClass();
                        m4Var.a(obj2);
                        return;
                    default:
                        k4 k4Var = (k4) obj;
                        y4 y4Var = (y4) obj2;
                        k4Var.getClass();
                        pa.q(!y4Var.f15273u.equals(y4Var.f15274v), "range must not be empty, but was %s", y4Var);
                        k4Var.f14543a.add(y4Var);
                        return;
                }
            }
        }, new m3(0), new n3(0), new Collector.Characteristics[0]);
    }
}
