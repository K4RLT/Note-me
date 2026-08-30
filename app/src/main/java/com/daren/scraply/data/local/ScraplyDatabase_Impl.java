package com.daren.scraply.data.local;

import c4.g;
import com.daren.scraply.data.local.ScraplyDatabase_Impl;
import df.a;
import g5.f;
import j7.l;
import j7.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.z;
import pe.n;
import qe.s;

/* loaded from: classes.dex */
public final class ScraplyDatabase_Impl extends ScraplyDatabase {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f4154u = 0;

    /* renamed from: r, reason: collision with root package name */
    public final n f4155r;

    /* renamed from: s, reason: collision with root package name */
    public final n f4156s;

    /* renamed from: t, reason: collision with root package name */
    public final n f4157t;

    public ScraplyDatabase_Impl() {
        final int i = 0;
        this.f4155r = new n(new a(this) { // from class: i7.e

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ScraplyDatabase_Impl f18335v;

            {
                this.f18335v = this;
            }

            @Override // df.a
            public final Object invoke() {
                int i10 = i;
                ScraplyDatabase_Impl scraplyDatabase_Impl = this.f18335v;
                switch (i10) {
                    case 0:
                        int i11 = ScraplyDatabase_Impl.f4154u;
                        return new l(scraplyDatabase_Impl);
                    case 1:
                        int i12 = ScraplyDatabase_Impl.f4154u;
                        return new j7.f(scraplyDatabase_Impl);
                    default:
                        int i13 = ScraplyDatabase_Impl.f4154u;
                        return new q(scraplyDatabase_Impl);
                }
            }
        });
        final int i10 = 1;
        this.f4156s = new n(new a(this) { // from class: i7.e

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ScraplyDatabase_Impl f18335v;

            {
                this.f18335v = this;
            }

            @Override // df.a
            public final Object invoke() {
                int i102 = i10;
                ScraplyDatabase_Impl scraplyDatabase_Impl = this.f18335v;
                switch (i102) {
                    case 0:
                        int i11 = ScraplyDatabase_Impl.f4154u;
                        return new l(scraplyDatabase_Impl);
                    case 1:
                        int i12 = ScraplyDatabase_Impl.f4154u;
                        return new j7.f(scraplyDatabase_Impl);
                    default:
                        int i13 = ScraplyDatabase_Impl.f4154u;
                        return new q(scraplyDatabase_Impl);
                }
            }
        });
        final int i11 = 2;
        this.f4157t = new n(new a(this) { // from class: i7.e

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ScraplyDatabase_Impl f18335v;

            {
                this.f18335v = this;
            }

            @Override // df.a
            public final Object invoke() {
                int i102 = i11;
                ScraplyDatabase_Impl scraplyDatabase_Impl = this.f18335v;
                switch (i102) {
                    case 0:
                        int i112 = ScraplyDatabase_Impl.f4154u;
                        return new l(scraplyDatabase_Impl);
                    case 1:
                        int i12 = ScraplyDatabase_Impl.f4154u;
                        return new j7.f(scraplyDatabase_Impl);
                    default:
                        int i13 = ScraplyDatabase_Impl.f4154u;
                        return new q(scraplyDatabase_Impl);
                }
            }
        });
    }

    @Override // g5.v
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // g5.v
    public final f e() {
        return new f(this, new LinkedHashMap(), new LinkedHashMap(), "notebooks", "canvas_elements", "stacks");
    }

    @Override // g5.v
    public final g f() {
        return new i7.f(this);
    }

    @Override // g5.v
    public final Set m() {
        return new LinkedHashSet();
    }

    @Override // g5.v
    public final LinkedHashMap o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e a10 = z.a(l.class);
        s sVar = s.f24023u;
        linkedHashMap.put(a10, sVar);
        linkedHashMap.put(z.a(j7.f.class), sVar);
        linkedHashMap.put(z.a(q.class), sVar);
        return linkedHashMap;
    }

    @Override // com.daren.scraply.data.local.ScraplyDatabase
    public final j7.f x() {
        return (j7.f) this.f4156s.getValue();
    }

    @Override // com.daren.scraply.data.local.ScraplyDatabase
    public final l y() {
        return (l) this.f4155r.getValue();
    }

    @Override // com.daren.scraply.data.local.ScraplyDatabase
    public final q z() {
        return (q) this.f4157t.getValue();
    }
}
