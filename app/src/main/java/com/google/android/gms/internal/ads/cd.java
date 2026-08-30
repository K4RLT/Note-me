package com.google.android.gms.internal.ads;
import ab.b;
import nc.a;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cd {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f5077a;

    static {
        l51 l51Var;
        bl0 bl0Var = new bl0(10);
        bl0Var.d(pc.f9479u, -42L, -64L);
        bl0Var.d(pc.f9481v, -6L, -53L);
        bl0Var.d(pc.f9483w, -41L, -31L);
        bl0Var.d(pc.f9485x, -40L, -28L);
        bl0Var.d(pc.f9487y, -29L, -37L);
        bl0Var.d(pc.f9489z, -80L, -32L);
        bl0Var.d(pc.A, -17L, -36L);
        bl0Var.d(pc.B, -82L, -35L);
        bl0Var.d(pc.C, -63L, -52L);
        bl0Var.d(pc.D, -23L, -11L);
        bl0Var.d(pc.E, -69L, -68L);
        bl0Var.d(pc.F, -62L, -55L);
        bl0Var.d(pc.G, -78L, -25L);
        bl0Var.d(pc.H, -71L, -3L);
        bl0Var.d(pc.I, -18L, -4L);
        bl0Var.d(pc.J, -67L, -19L);
        bl0Var.d(pc.K, -58L);
        bl0Var.d(pc.L, -2L);
        bl0Var.d(pc.M, -34L);
        bl0Var.d(pc.N, -30L);
        bl0Var.d(pc.O, -56L);
        bl0Var.d(pc.Q, -57L);
        bl0Var.d(pc.R, -66L);
        bl0Var.d(pc.S, -60L);
        bl0Var.d(pc.T, -27L);
        bl0Var.d(pc.U, -26L);
        bl0Var.d(pc.V, -74L);
        bl0Var.d(pc.W, -77L);
        bl0Var.d(pc.Y, -38L);
        bl0Var.d(pc.f9461a0, -79L);
        bl0Var.d(pc.f9462b0, -7L);
        bl0Var.d(pc.f9463c0, -51L);
        bl0Var.d(pc.f9464d0, -9L);
        bl0Var.d(pc.f9465e0, -47L);
        bl0Var.d(pc.f9466f0, -70L);
        bl0Var.d(pc.f9467g0, -14L);
        bl0Var.d(pc.f9468h0, -5L);
        bl0Var.d(pc.f9469i0, -39L);
        bl0Var.d(pc.f9470j0, -8L);
        bl0Var.d(pc.f9471k0, -54L);
        bl0Var.d(pc.l0, -15L);
        bl0Var.d(pc.m0, -12L);
        bl0Var.d(pc.f9472n0, -21L);
        bl0Var.d(pc.f9473o0, -43L);
        bl0Var.d(pc.Z, -20L);
        bl0Var.d(pc.X, -81L);
        bl0Var.d(pc.f9474p0, -46L);
        bl0Var.d(pc.f9475q0, -61L);
        bl0Var.d(pc.f9476r0, -44L);
        bl0Var.d(pc.P, -59L);
        bl0Var.d(pc.f9477s0, -49L);
        bl0Var.d(pc.f9478t0, -75L);
        bl0Var.d(pc.f9480u0, -24L);
        bl0Var.d(pc.f9490z0, -13L);
        bl0Var.d(pc.A0, -1L);
        bl0Var.d(pc.f9482v0, -33L);
        bl0Var.d(pc.f9484w0, -45L);
        bl0Var.d(pc.f9486x0, -50L);
        bl0Var.d(pc.f9488y0, -65L);
        bl0Var.d(pc.B0, -16L);
        bl0Var.d(pc.C0, -73L);
        bl0Var.d(pc.D0, -10L);
        bl0Var.d(pc.E0, -48L);
        bl0Var.d(pc.F0, -22L);
        bl0Var.d(pc.G0, -76L);
        bl0Var.d(pc.H0, -72L);
        s41 s41Var = (s41) bl0Var.f4819v;
        if (s41Var == null) {
            l51Var = x41.A;
        } else {
            Collection entrySet = s41Var.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                l51Var = x41.A;
            } else {
                p41 p41Var = (p41) entrySet;
                nb nbVar = new nb(p41Var.f9362v.size());
                Iterator it = p41Var.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    j51 r8 = j51.r(((i51) entry.getValue()).h());
                    if (!r8.isEmpty()) {
                        nbVar.e(key, r8);
                        i += r8.size();
                    }
                }
                l51Var = new l51(nbVar.q(true), i);
            }
        }
        k51 k51Var = l51Var.f7952z;
        if (k51Var == null) {
            k51Var = new k51(l51Var);
            l51Var.f7952z = k51Var;
        }
        m61 a10 = k51Var.a();
        while (a10.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a10.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new b(a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())), 2);
            }
        }
        HashMap hashMap = new HashMap();
        k51 k51Var2 = l51Var.f7952z;
        if (k51Var2 == null) {
            k51Var2 = new k51(l51Var);
            l51Var.f7952z = k51Var2;
        }
        m61 a11 = k51Var2.a();
        while (a11.hasNext()) {
            Map.Entry entry3 = (Map.Entry) a11.next();
            pc pcVar = (pc) entry3.getKey();
            Long l10 = (Long) entry3.getValue();
            long longValue = l10.longValue();
            if (!hashMap.containsKey(l10)) {
                hashMap.put(l10, pcVar);
            } else {
                String valueOf = String.valueOf(hashMap.get(l10));
                String valueOf2 = String.valueOf(pcVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + String.valueOf(longValue).length() + 27 + 5 + valueOf2.length());
                String a12 = a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA==");
                String a13 = a("cQk=");
                String a14 = a("a0ivq0U=");
                sb2.append(a12);
                sb2.append(longValue);
                sb2.append(a13);
                sb2.append(valueOf);
                sb2.append(a14);
                sb2.append(valueOf2);
                throw new b(sb2.toString(), 2);
            }
        }
        f5077a = hashMap;
    }
}
