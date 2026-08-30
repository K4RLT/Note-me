package l8;
import b.a;

import android.content.Context;
import android.net.ConnectivityManager;
import bd.d;
import java.net.MalformedURLException;
import java.net.URL;
import m8.a0;
import m8.b0;
import m8.c;
import m8.c0;
import m8.d0;
import m8.e0;
import m8.f;
import m8.f0;
import m8.g;
import m8.i;
import m8.i0;
import m8.j;
import m8.k;
import m8.l;
import m8.m;
import m8.n;
import m8.o;
import m8.p;
import m8.q;
import m8.r;
import m8.s;
import m8.t;
import m8.v;
import m8.w;
import m8.y;
import o8.e;
import z5.h;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final h f20023a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f20024b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20025c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f20026d;
    public final w8.a e;

    /* renamed from: f, reason: collision with root package name */
    public final w8.a f20027f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20028g;

    public b(Context context, w8.a aVar, w8.a aVar2) {
        d dVar = new d();
        c cVar = c.f20685a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f20712a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        m8.d dVar2 = m8.d.f20687a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        m8.b bVar = m8.b.f20674a;
        dVar.a(m8.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.f20704a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        m8.e eVar = m8.e.f20690a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        m8.h hVar = m8.h.f20700a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.f20696a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f20721a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.f20693a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f3204x = true;
        this.f20023a = new h(5, dVar);
        this.f20025c = context;
        this.f20024b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20026d = b(a.f20018c);
        this.e = aVar2;
        this.f20027f = aVar;
        this.f20028g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(g3.a.k("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (((m8.g0) m8.g0.f20698u.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n8.h a(n8.h r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.a(n8.h):n8.h");
    }
}
