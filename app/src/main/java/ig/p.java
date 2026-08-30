package ig;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ya.mb;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public nd.o f18542a;

    /* renamed from: b, reason: collision with root package name */
    public Proxy f18543b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18544c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18545d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18546f;

    /* renamed from: g, reason: collision with root package name */
    public final b f18547g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f18548h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final SocketFactory f18549j;

    /* renamed from: k, reason: collision with root package name */
    public SSLSocketFactory f18550k;

    /* renamed from: l, reason: collision with root package name */
    public mb f18551l;

    /* renamed from: m, reason: collision with root package name */
    public HostnameVerifier f18552m;

    /* renamed from: n, reason: collision with root package name */
    public final d f18553n;

    /* renamed from: o, reason: collision with root package name */
    public final b f18554o;

    /* renamed from: p, reason: collision with root package name */
    public final b f18555p;

    /* renamed from: q, reason: collision with root package name */
    public final g f18556q;

    /* renamed from: r, reason: collision with root package name */
    public final b f18557r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f18558s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18559t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18560u;

    /* renamed from: v, reason: collision with root package name */
    public int f18561v;

    /* renamed from: w, reason: collision with root package name */
    public int f18562w;

    /* renamed from: x, reason: collision with root package name */
    public int f18563x;

    public p(q qVar) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f18546f = arrayList2;
        this.f18542a = qVar.f18564u;
        this.f18543b = qVar.f18565v;
        this.f18544c = qVar.f18566w;
        this.f18545d = qVar.f18567x;
        arrayList.addAll(qVar.f18568y);
        arrayList2.addAll(qVar.f18569z);
        this.f18547g = qVar.A;
        this.f18548h = qVar.B;
        this.i = qVar.C;
        this.f18549j = qVar.D;
        this.f18550k = qVar.E;
        this.f18551l = qVar.F;
        this.f18552m = qVar.G;
        this.f18553n = qVar.H;
        this.f18554o = qVar.I;
        this.f18555p = qVar.J;
        this.f18556q = qVar.K;
        this.f18557r = qVar.L;
        this.f18558s = qVar.M;
        this.f18559t = qVar.N;
        this.f18560u = qVar.O;
        this.f18561v = qVar.P;
        this.f18562w = qVar.Q;
        this.f18563x = qVar.R;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ig.b, java.lang.Object] */
    public p() {
        this.e = new ArrayList();
        this.f18546f = new ArrayList();
        this.f18542a = new nd.o(5);
        this.f18544c = q.S;
        this.f18545d = q.T;
        this.f18547g = new Object();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f18548h = proxySelector;
        if (proxySelector == null) {
            this.f18548h = new ProxySelector();
        }
        this.i = b.f18461b;
        this.f18549j = SocketFactory.getDefault();
        this.f18552m = rg.c.f24824a;
        this.f18553n = d.f18475c;
        b bVar = b.f18460a;
        this.f18554o = bVar;
        this.f18555p = bVar;
        this.f18556q = new g();
        this.f18557r = b.f18462c;
        this.f18558s = true;
        this.f18559t = true;
        this.f18560u = true;
        this.f18561v = 10000;
        this.f18562w = 10000;
        this.f18563x = 10000;
    }
}
