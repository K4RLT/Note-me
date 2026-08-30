package ig;
import x.n;
import q.b;
import q.x;

import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import ya.dc;
import ya.mb;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f18475c = new d(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f18476a;

    /* renamed from: b, reason: collision with root package name */
    public final mb f18477b;

    public d(LinkedHashSet linkedHashSet, mb mbVar) {
        this.f18476a = linkedHashSet;
        this.f18477b = mbVar;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            StringBuilder sb2 = new StringBuilder("sha256/");
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            char[] cArr = sg.h.f25275x;
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(dc.b(encoded).f25279w);
            digest.getClass();
            char[] cArr2 = tg.a.f25759a;
            byte[] bArr = sg.a.f25260a;
            bArr.getClass();
            byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
            int length = digest.length - (digest.length % 3);
            int i = 0;
            int i10 = 0;
            while (i < length) {
                byte b10 = digest[i];
                int i11 = i + 2;
                byte b11 = digest[i + 1];
                i += 3;
                byte b12 = digest[i11];
                bArr2[i10] = bArr[(b10 & 255) >> 2];
                bArr2[i10 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
                int i12 = i10 + 3;
                bArr2[i10 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
                i10 += 4;
                bArr2[i12] = bArr[b12 & 63];
            }
            int length2 = digest.length - length;
            if (length2 != 1) {
                if (length2 == 2) {
                    int i13 = i + 1;
                    byte b13 = digest[i];
                    byte b14 = digest[i13];
                    bArr2[i10] = bArr[(b13 & 255) >> 2];
                    bArr2[i10 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                    bArr2[i10 + 2] = bArr[(b14 & 15) << 2];
                    bArr2[i10 + 3] = (byte) 61;
                }
            } else {
                byte b15 = digest[i];
                bArr2[i10] = bArr[(b15 & 255) >> 2];
                bArr2[i10 + 1] = bArr[(b15 & 3) << 4];
                byte b16 = (byte) 61;
                bArr2[i10 + 2] = b16;
                bArr2[i10 + 3] = b16;
            }
            sb2.append(new String(bArr2, mf.a.f20798a));
            return sb2.toString();
        }
        x.n("Certificate pinning requires X509 certificates");
        return null;
    }

    public final void a(String str, List list) {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f18476a.iterator();
        if (!it.hasNext()) {
            if (list2.isEmpty()) {
                return;
            }
            mb mbVar = this.f18477b;
            if (mbVar != null) {
                list = mbVar.a(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.size() > 0) {
                    list2.get(0).getClass();
                    g5.b();
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                sb2.append("\n    ");
                sb2.append(b(x509Certificate));
                sb2.append(": ");
                sb2.append(x509Certificate.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size3 = list2.size();
            for (int i11 = 0; i11 < size3; i11++) {
                if (list2.get(i11) == null) {
                    sb2.append("\n    null");
                } else {
                    g5.b();
                    return;
                }
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
        it.next().getClass();
        g5.b();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (jg.b.j(this.f18477b, dVar.f18477b) && this.f18476a.equals(dVar.f18476a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        mb mbVar = this.f18477b;
        if (mbVar != null) {
            i = mbVar.hashCode();
        } else {
            i = 0;
        }
        return this.f18476a.hashCode() + (i * 31);
    }
}
