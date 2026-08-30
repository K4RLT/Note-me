package rg;
import a.a;

import ya.mb;

/* loaded from: classes.dex */
public final class a extends mb {

    /* renamed from: a, reason: collision with root package name */
    public final d f24822a;

    public a(d dVar) {
        this.f24822a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // ya.mb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r0 = r8.removeFirst()
            r9.add(r0)
            r0 = 0
            r1 = r0
        L13:
            r2 = 9
            if (r0 >= r2) goto L99
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r9.get(r2)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            rg.d r4 = r7.f24822a
            java.security.cert.X509Certificate r4 = r4.a(r2)
            if (r4 == 0) goto L53
            int r1 = r9.size()
            if (r1 > r3) goto L37
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L3a
        L37:
            r9.add(r4)
        L3a:
            java.security.Principal r1 = r4.getIssuerDN()
            java.security.Principal r2 = r4.getSubjectDN()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            goto L51
        L49:
            java.security.PublicKey r1 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L51
            r4.verify(r1)     // Catch: java.security.GeneralSecurityException -> L51
            goto L84
        L51:
            r1 = r3
            goto L7f
        L53:
            java.util.Iterator r3 = r8.iterator()
        L57:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r3.next()
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            java.security.Principal r5 = r2.getIssuerDN()
            java.security.Principal r6 = r4.getSubjectDN()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L72
            goto L57
        L72:
            java.security.PublicKey r5 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L57
            r2.verify(r5)     // Catch: java.security.GeneralSecurityException -> L57
            r3.remove()
            r9.add(r4)
        L7f:
            int r0 = r0 + 1
            goto L13
        L82:
            if (r1 == 0) goto L85
        L84:
            return r9
        L85:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L99:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.a.a(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && ((a) obj).f24822a.equals(this.f24822a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24822a.hashCode();
    }
}
