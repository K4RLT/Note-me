package com.google.android.gms.internal.ads;
import eb.k0;
import ig.b;
import ig.e;
import ig.f;
import ig.h;
import ig.i;
import jg.b;
import n9.f;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class js implements f {

    /* renamed from: a, reason: collision with root package name */
    public int f7520a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7521b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7522c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7523d;

    public js(HashSet hashSet, boolean z3, int i, boolean z9) {
        this.f7523d = hashSet;
        this.f7521b = z3;
        this.f7520a = i;
        this.f7522c = z9;
    }

    @Override // f
    public int a() {
        return this.f7520a;
    }

    @Override // f
    public boolean b() {
        return this.f7522c;
    }

    @Override // f
    public boolean c() {
        return this.f7521b;
    }

    @Override // f
    public Set d() {
        return (Set) this.f7523d;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h, java.lang.Object] */
    public i e(SSLSocket sSLSocket) {
        boolean z3;
        i iVar;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i = this.f7520a;
        List list = (List) this.f7523d;
        int size = list.size();
        while (true) {
            z3 = true;
            if (i < size) {
                iVar = (i) list.get(i);
                if (iVar.a(sSLSocket)) {
                    this.f7520a = i + 1;
                    break;
                }
                i++;
            } else {
                iVar = null;
                break;
            }
        }
        if (iVar != null) {
            int i10 = this.f7520a;
            while (true) {
                if (i10 < list.size()) {
                    if (((i) list.get(i10)).a(sSLSocket)) {
                        break;
                    }
                    i10++;
                } else {
                    z3 = false;
                    break;
                }
            }
            this.f7521b = z3;
            b bVar = b.e;
            boolean z9 = this.f7522c;
            bVar.getClass();
            Object r02 = iVar.f18511d;
            String[] strArr = iVar.f18510c;
            if (strArr != null) {
                enabledCipherSuites = b.m(f.f18478b, sSLSocket.getEnabledCipherSuites(), strArr);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            if (r02 != 0) {
                enabledProtocols = b.m(b.f19203f, sSLSocket.getEnabledProtocols(), r02);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            e eVar = f.f18478b;
            byte[] bArr = b.f19199a;
            int length = supportedCipherSuites.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (eVar.compare(supportedCipherSuites[i11], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (z9 && i11 != -1) {
                String str = supportedCipherSuites[i11];
                int length2 = enabledCipherSuites.length;
                String[] strArr2 = new String[length2 + 1];
                System.arraycopy(enabledCipherSuites, 0, strArr2, 0, enabledCipherSuites.length);
                strArr2[length2] = str;
                enabledCipherSuites = strArr2;
            }
            Object obj = new Object();
            obj.f18503a = iVar.f18508a;
            obj.f18505c = strArr;
            obj.f18506d = r02;
            obj.f18504b = iVar.f18509b;
            obj.b(enabledCipherSuites);
            obj.d(enabledProtocols);
            i iVar2 = new i(obj);
            String[] strArr3 = iVar2.f18511d;
            if (strArr3 != null) {
                sSLSocket.setEnabledProtocols(strArr3);
            }
            String[] strArr4 = iVar2.f18510c;
            if (strArr4 != null) {
                sSLSocket.setEnabledCipherSuites(strArr4);
            }
            return iVar;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f7522c);
        sb2.append(", modes=");
        sb2.append(list);
        String arrays = Arrays.toString(sSLSocket.getEnabledProtocols());
        sb2.append(", supported protocols=");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public void f(Object obj, String str) {
        ((k0) this.f7523d).B(this.f7520a, this.f7521b, this.f7522c, str, obj, null, null);
    }

    public void g(String str) {
        ((k0) this.f7523d).B(this.f7520a, this.f7521b, this.f7522c, str, null, null, null);
    }

    public void h(String str, Object obj, Object obj2) {
        ((k0) this.f7523d).B(this.f7520a, this.f7521b, this.f7522c, str, obj, obj2, null);
    }

    public void i(String str, Object obj, Object obj2, Object obj3) {
        ((k0) this.f7523d).B(this.f7520a, this.f7521b, this.f7522c, str, obj, obj2, obj3);
    }

    public js(k0 k0Var, int i, boolean z3, boolean z9) {
        this.f7523d = k0Var;
        this.f7520a = i;
        this.f7521b = z3;
        this.f7522c = z9;
    }

    public js(List list) {
        this.f7520a = 0;
        this.f7523d = list;
    }
}