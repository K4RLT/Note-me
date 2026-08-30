package lg;
import b.a;
import b.b;

import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.dr;
import g5.q;
import ig.g;
import ig.n;
import ig.u;
import ig.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import k6.i;
import og.a0;
import og.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ig.a f20387a;

    /* renamed from: b, reason: collision with root package name */
    public ad f20388b;

    /* renamed from: c, reason: collision with root package name */
    public z f20389c;

    /* renamed from: d, reason: collision with root package name */
    public final g f20390d;
    public final u e;

    /* renamed from: f, reason: collision with root package name */
    public final ig.b f20391f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f20392g;

    /* renamed from: h, reason: collision with root package name */
    public final dr f20393h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public b f20394j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20395k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20396l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20397m;

    /* renamed from: n, reason: collision with root package name */
    public mg.b f20398n;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.android.gms.internal.ads.dr] */
    public e(g gVar, ig.a aVar, u uVar, ig.b bVar, Object obj) {
        List l10;
        this.f20390d = gVar;
        this.f20387a = aVar;
        this.e = uVar;
        this.f20391f = bVar;
        ig.b.e.getClass();
        i iVar = gVar.e;
        Object obj2 = new Object();
        List list = Collections.EMPTY_LIST;
        obj2.e = list;
        obj2.f5486f = list;
        obj2.f5487g = new ArrayList();
        obj2.f5484c = aVar;
        obj2.f5485d = iVar;
        obj2.f5482a = bVar;
        n nVar = aVar.f18445a;
        Proxy proxy = aVar.f18451h;
        if (proxy != null) {
            obj2.e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f18450g.select(nVar.k());
            if (select != null && !select.isEmpty()) {
                l10 = Collections.unmodifiableList(new ArrayList(select));
            } else {
                l10 = jg.b.l(Proxy.NO_PROXY);
            }
            obj2.e = l10;
        }
        obj2.f5483b = 0;
        this.f20393h = obj2;
        this.f20392g = obj;
    }

    public final synchronized b a() {
        return this.f20394j;
    }

    public final Socket b(boolean z3, boolean z9, boolean z10) {
        Socket socket;
        if (z10) {
            this.f20398n = null;
        }
        if (z9) {
            this.f20396l = true;
        }
        b bVar = this.f20394j;
        if (bVar != null) {
            if (z3) {
                bVar.f20379k = true;
            }
            if (this.f20398n == null && (this.f20396l || bVar.f20379k)) {
                ArrayList arrayList = bVar.f20382n;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.f20394j.f20382n.isEmpty()) {
                            this.f20394j.f20383o = System.nanoTime();
                            ig.b bVar2 = ig.b.e;
                            b bVar3 = this.f20394j;
                            bVar2.getClass();
                            g gVar = this.f20390d;
                            gVar.getClass();
                            if (!bVar3.f20379k && gVar.f18498a != 0) {
                                gVar.notifyAll();
                            } else {
                                gVar.f18501d.remove(bVar3);
                                socket = this.f20394j.e;
                                this.f20394j = null;
                                return socket;
                            }
                        }
                        socket = null;
                        this.f20394j = null;
                        return socket;
                    }
                }
                q.l();
                return null;
            }
        }
        return null;
    }

    public final b c(int i, int i10, int i11, boolean z3) {
        b bVar;
        boolean z9;
        Socket socket;
        b bVar2;
        boolean z10;
        z zVar;
        boolean z11;
        b bVar3;
        Socket socket2;
        boolean z12;
        ad adVar;
        String str;
        int i12;
        boolean contains;
        synchronized (this.f20390d) {
            try {
                if (!this.f20396l) {
                    if (this.f20398n == null) {
                        if (!this.f20397m) {
                            bVar = this.f20394j;
                            z9 = true;
                            if (bVar != null && bVar.f20379k) {
                                socket = b(false, false, true);
                            } else {
                                socket = null;
                            }
                            bVar2 = this.f20394j;
                            if (bVar2 != null) {
                                bVar = null;
                            } else {
                                bVar2 = null;
                            }
                            if (!this.f20395k) {
                                bVar = null;
                            }
                            if (bVar2 == null) {
                                ig.b bVar4 = ig.b.e;
                                g gVar = this.f20390d;
                                ig.a aVar = this.f20387a;
                                bVar4.getClass();
                                ig.b(gVar, aVar, this, null);
                                b bVar5 = this.f20394j;
                                if (bVar5 != null) {
                                    z10 = true;
                                    bVar2 = bVar5;
                                } else {
                                    zVar = this.f20389c;
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            zVar = null;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        jg.b.e(socket);
        if (bVar != null) {
            this.f20391f.getClass();
        }
        if (z10) {
            this.f20391f.getClass();
        }
        if (bVar2 != null) {
            return bVar2;
        }
        if (zVar == null && ((adVar = this.f20388b) == null || adVar.f4459b >= adVar.f4458a.size())) {
            dr drVar = this.f20393h;
            if (drVar.f5483b < ((List) drVar.e).size() || !((ArrayList) drVar.f5487g).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                while (drVar.f5483b < ((List) drVar.e).size()) {
                    ig.a aVar2 = (ig.a) drVar.f5484c;
                    if (drVar.f5483b < ((List) drVar.e).size()) {
                        List list = (List) drVar.e;
                        int i13 = drVar.f5483b;
                        drVar.f5483b = i13 + 1;
                        Proxy proxy = (Proxy) list.get(i13);
                        ig.b bVar6 = (ig.b) drVar.f5482a;
                        drVar.f5486f = new ArrayList();
                        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                } else {
                                    str = address2.getHostAddress();
                                }
                                i12 = inetSocketAddress.getPort();
                            } else {
                                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
                            }
                        } else {
                            n nVar = aVar2.f18445a;
                            str = nVar.f18538d;
                            i12 = nVar.e;
                        }
                        if (i12 >= 1 && i12 <= 65535) {
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                ((List) drVar.f5486f).add(InetSocketAddress.createUnresolved(str, i12));
                            } else {
                                bVar6.getClass();
                                aVar2.f18446b.getClass();
                                if (str != null) {
                                    try {
                                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                                        if (!asList.isEmpty()) {
                                            int size = asList.size();
                                            for (int i14 = 0; i14 < size; i14++) {
                                                ((List) drVar.f5486f).add(new InetSocketAddress((InetAddress) asList.get(i14), i12));
                                            }
                                        } else {
                                            throw new UnknownHostException(aVar2.f18446b + " returned no addresses for " + str);
                                        }
                                    } catch (NullPointerException e) {
                                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                        unknownHostException.initCause(e);
                                        throw unknownHostException;
                                    }
                                } else {
                                    throw new UnknownHostException("hostname == null");
                                }
                            }
                            int size2 = ((List) drVar.f5486f).size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                z zVar2 = new z((ig.a) drVar.f5484c, proxy, (InetSocketAddress) ((List) drVar.f5486f).get(i15));
                                i iVar = (i) drVar.f5485d;
                                synchronized (iVar) {
                                    contains = ((LinkedHashSet) iVar.f19569v).contains(zVar2);
                                }
                                if (contains) {
                                    ((ArrayList) drVar.f5487g).add(zVar2);
                                } else {
                                    arrayList.add(zVar2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        } else {
                            throw new SocketException("No route to " + str + ":" + i12 + "; port is out of range");
                        }
                    } else {
                        throw new SocketException("No route to " + aVar2.f18445a.f18538d + "; exhausted proxy configurations: " + ((List) drVar.e));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll((ArrayList) drVar.f5487g);
                    ((ArrayList) drVar.f5487g).clear();
                }
                this.f20388b = new ad(arrayList);
                z11 = true;
            } else {
                l4.a.c();
                return null;
            }
        } else {
            z11 = false;
        }
        synchronized (this.f20390d) {
            try {
                if (!this.f20397m) {
                    if (z11) {
                        ad adVar2 = this.f20388b;
                        adVar2.getClass();
                        ArrayList arrayList2 = new ArrayList(adVar2.f4458a);
                        int size3 = arrayList2.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size3) {
                                break;
                            }
                            z zVar3 = (z) arrayList2.get(i16);
                            ig.b bVar7 = ig.b.e;
                            g gVar2 = this.f20390d;
                            ig.a aVar3 = this.f20387a;
                            bVar7.getClass();
                            ig.b(gVar2, aVar3, this, zVar3);
                            b bVar8 = this.f20394j;
                            if (bVar8 != null) {
                                this.f20389c = zVar3;
                                z10 = true;
                                bVar2 = bVar8;
                                break;
                            }
                            i16++;
                        }
                    }
                    if (!z10) {
                        if (zVar == null) {
                            ad adVar3 = this.f20388b;
                            if (adVar3.f4459b < adVar3.f4458a.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                ArrayList arrayList3 = adVar3.f4458a;
                                int i17 = adVar3.f4459b;
                                adVar3.f4459b = i17 + 1;
                                zVar = (z) arrayList3.get(i17);
                            } else {
                                throw new NoSuchElementException();
                            }
                        }
                        this.f20389c = zVar;
                        this.i = 0;
                        bVar2 = new b(this.f20390d, zVar);
                        if (this.f20394j == null) {
                            this.f20394j = bVar2;
                            this.f20395k = false;
                            bVar2.f20382n.add(new d(this, this.f20392g));
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    bVar3 = bVar2;
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z10) {
            this.f20391f.getClass();
            return bVar3;
        }
        bVar3.c(i, i10, i11, z3, this.f20391f);
        ig.b bVar9 = ig.b.e;
        g gVar3 = this.f20390d;
        bVar9.getClass();
        gVar3.e.n(bVar3.f20373c);
        synchronized (this.f20390d) {
            try {
                this.f20395k = true;
                ig.b bVar10 = ig.b.e;
                g gVar4 = this.f20390d;
                bVar10.getClass();
                if (!gVar4.f18502f) {
                    gVar4.f18502f = true;
                    g.f18497g.execute(gVar4.f18500c);
                }
                gVar4.f18501d.add(bVar3);
                if (bVar3.f20377h == null) {
                    z9 = false;
                }
                if (z9) {
                    ig.b bVar11 = ig.b.e;
                    g gVar5 = this.f20390d;
                    ig.a aVar4 = this.f20387a;
                    bVar11.getClass();
                    socket2 = ig.a(gVar5, aVar4, this);
                    bVar3 = this.f20394j;
                } else {
                    socket2 = null;
                }
            } finally {
            }
        }
        jg.b.e(socket2);
        this.f20391f.getClass();
        return bVar3;
    }

    public final b d(int i, int i10, int i11, boolean z3, boolean z9) {
        b c10;
        boolean z10;
        while (true) {
            c10 = c(i, i10, i11, z3);
            synchronized (this.f20390d) {
                try {
                    if (c10.f20380l != 0) {
                        boolean z11 = false;
                        if (!c10.e.isClosed() && !c10.e.isInputShutdown() && !c10.e.isOutputShutdown()) {
                            r rVar = c10.f20377h;
                            if (rVar != null) {
                                synchronized (rVar) {
                                    z10 = rVar.A;
                                }
                                z11 = !z10;
                            } else {
                                if (z9) {
                                    try {
                                        int soTimeout = c10.e.getSoTimeout();
                                        try {
                                            c10.e.setSoTimeout(1);
                                            boolean f10 = c10.i.f();
                                            Socket socket = c10.e;
                                            if (f10) {
                                                socket.setSoTimeout(soTimeout);
                                            } else {
                                                socket.setSoTimeout(soTimeout);
                                            }
                                        } catch (Throwable th) {
                                            c10.e.setSoTimeout(soTimeout);
                                            throw th;
                                            break;
                                        }
                                    } catch (SocketTimeoutException unused) {
                                    } catch (IOException unused2) {
                                    }
                                }
                                z11 = true;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        e();
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        return c10;
    }

    public final void e() {
        b bVar;
        Socket b10;
        synchronized (this.f20390d) {
            bVar = this.f20394j;
            b10 = b(true, false, false);
            if (this.f20394j != null) {
                bVar = null;
            }
        }
        jg.b.e(b10);
        if (bVar != null) {
            this.f20391f.getClass();
        }
    }

    public final void f() {
        b bVar;
        Socket b10;
        synchronized (this.f20390d) {
            bVar = this.f20394j;
            b10 = b(false, true, false);
            if (this.f20394j != null) {
                bVar = null;
            }
        }
        jg.b.e(b10);
        if (bVar != null) {
            ig.b bVar2 = ig.b.e;
            u uVar = this.e;
            bVar2.getClass();
            uVar.e(null);
            this.f20391f.getClass();
            this.f20391f.getClass();
        }
    }

    public final void g(IOException iOException) {
        b bVar;
        boolean z3;
        boolean z9;
        Socket b10;
        synchronized (this.f20390d) {
            try {
                bVar = null;
                if (iOException instanceof a0) {
                    int i = ((a0) iOException).f21978u;
                    if (i == 5) {
                        int i10 = this.i + 1;
                        this.i = i10;
                        if (i10 > 1) {
                            this.f20389c = null;
                            z9 = true;
                        }
                        z9 = false;
                    } else {
                        if (i != 6) {
                            this.f20389c = null;
                            z9 = true;
                        }
                        z9 = false;
                    }
                } else {
                    b bVar2 = this.f20394j;
                    if (bVar2 != null) {
                        if (bVar2.f20377h != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 || (iOException instanceof og.a)) {
                            if (bVar2.f20380l == 0) {
                                z zVar = this.f20389c;
                                if (zVar != null && iOException != null) {
                                    this.f20393h.b(zVar, iOException);
                                }
                                this.f20389c = null;
                            }
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                b bVar3 = this.f20394j;
                b10 = b(z9, false, true);
                if (this.f20394j == null && this.f20395k) {
                    bVar = bVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jg.b.e(b10);
        if (bVar != null) {
            this.f20391f.getClass();
        }
    }

    public final void h(boolean z3, mg.b bVar, IOException iOException) {
        b bVar2;
        Socket b10;
        boolean z9;
        this.f20391f.getClass();
        synchronized (this.f20390d) {
            try {
                if (bVar == this.f20398n) {
                    if (!z3) {
                        this.f20394j.f20380l++;
                    }
                    bVar2 = this.f20394j;
                    b10 = b(z3, false, true);
                    if (this.f20394j != null) {
                        bVar2 = null;
                    }
                    z9 = this.f20396l;
                } else {
                    throw new IllegalStateException("expected " + this.f20398n + " but was " + bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jg.b.e(b10);
        if (bVar2 != null) {
            this.f20391f.getClass();
        }
        if (iOException != null) {
            ig.b bVar3 = ig.b.e;
            u uVar = this.e;
            bVar3.getClass();
            uVar.e(iOException);
            this.f20391f.getClass();
            return;
        }
        if (z9) {
            ig.b bVar4 = ig.b.e;
            u uVar2 = this.e;
            bVar4.getClass();
            uVar2.e(null);
            this.f20391f.getClass();
        }
    }

    public final String toString() {
        b a10 = a();
        if (a10 != null) {
            return a10.toString();
        }
        return this.f20387a.toString();
    }
}