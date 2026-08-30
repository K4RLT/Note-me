package ig;
import m.b;
import q.x;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f18528a;

    /* renamed from: d, reason: collision with root package name */
    public String f18531d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18532f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f18533g;

    /* renamed from: h, reason: collision with root package name */
    public String f18534h;

    /* renamed from: b, reason: collision with root package name */
    public String f18529b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f18530c = "";
    public int e = -1;

    public m() {
        ArrayList arrayList = new ArrayList();
        this.f18532f = arrayList;
        arrayList.add("");
    }

    public final n a() {
        if (this.f18528a != null) {
            if (this.f18531d != null) {
                return new n(this);
            }
            x.o("host == null");
            return null;
        }
        x.o("scheme == null");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0218, code lost:
    
        if (r4 <= 65535) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(ig.n r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.b(ig.n, java.lang.String):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f18528a;
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        } else {
            sb2.append("//");
        }
        if (!this.f18529b.isEmpty() || !this.f18530c.isEmpty()) {
            sb2.append(this.f18529b);
            if (!this.f18530c.isEmpty()) {
                sb2.append(':');
                sb2.append(this.f18530c);
            }
            sb2.append('@');
        }
        String str2 = this.f18531d;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f18531d);
                sb2.append(']');
            } else {
                sb2.append(this.f18531d);
            }
        }
        int i = this.e;
        if (i != -1 || this.f18528a != null) {
            if (i == -1) {
                i = b(this.f18528a);
            }
            String str3 = this.f18528a;
            if (str3 == null || i != b(str3)) {
                sb2.append(':');
                sb2.append(i);
            }
        }
        ArrayList arrayList = this.f18532f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append((String) arrayList.get(i10));
        }
        if (this.f18533g != null) {
            sb2.append('?');
            ArrayList arrayList2 = this.f18533g;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11 += 2) {
                String str4 = (String) arrayList2.get(i11);
                String str5 = (String) arrayList2.get(i11 + 1);
                if (i11 > 0) {
                    sb2.append('&');
                }
                sb2.append(str4);
                if (str5 != null) {
                    sb2.append('=');
                    sb2.append(str5);
                }
            }
        }
        if (this.f18534h != null) {
            sb2.append('#');
            sb2.append(this.f18534h);
        }
        return sb2.toString();
    }
}
