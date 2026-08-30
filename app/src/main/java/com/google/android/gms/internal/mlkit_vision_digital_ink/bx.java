package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class bx {

    /* renamed from: a, reason: collision with root package name */
    public static final s5 f14126a;

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.cp, com.google.android.gms.internal.mlkit_vision_digital_ink.k7, java.lang.Object] */
    static {
        o7 o7Var;
        ((g7) b7.f14067a).getClass();
        AtomicReference atomicReference = k7.f14549f;
        String str = "com.google.android.libraries.mdi.download.internal.logging.LogUtil$MDD";
        if (atomicReference.get() != null) {
            m7 m7Var = (m7) atomicReference.get();
            o7Var = new o7(str, m7Var.f14662a, m7Var.f14663b, m7Var.f14664c);
        } else {
            int i = 69;
            while (true) {
                if (i >= 0) {
                    char charAt = "com.google.android.libraries.mdi.download.internal.logging.LogUtil$MDD".charAt(i);
                    if (charAt == '$') {
                        str = "com.google.android.libraries.mdi.download.internal.logging.LogUtil$MDD".replace('$', '.');
                        break;
                    } else if (charAt == '.') {
                        break;
                    } else {
                        i--;
                    }
                } else {
                    break;
                }
            }
            cp cpVar = new cp(str);
            if (!k7.f14547c && !k7.f14548d) {
                if (k7.e) {
                    m7 m7Var2 = o7.f14742h;
                    cpVar.f14552b = new o7(str, Level.OFF, m7Var2.f14663b, m7Var2.f14664c);
                } else {
                    cpVar.f14552b = null;
                }
            } else {
                cpVar.f14552b = new n7(str);
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = i7.f14466a;
            concurrentLinkedQueue.offer(cpVar);
            o7Var = cpVar;
            if (atomicReference.get() != null) {
                while (true) {
                    k7 k7Var = (k7) concurrentLinkedQueue.poll();
                    if (k7Var == null) {
                        break;
                    }
                    m7 m7Var3 = (m7) atomicReference.get();
                    k7Var.f14552b = new o7((String) k7Var.f14164a, m7Var3.f14662a, m7Var3.f14663b, m7Var3.f14664c);
                }
                k7.m();
                o7Var = cpVar;
            }
        }
        f14126a = new s5(0, o7Var);
    }
}
