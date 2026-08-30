package qc;
import p.a;

import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends l2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23819c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23820d;
    public final Long e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23821f;

    /* renamed from: g, reason: collision with root package name */
    public final t1 f23822g;

    /* renamed from: h, reason: collision with root package name */
    public final k2 f23823h;
    public final j2 i;

    /* renamed from: j, reason: collision with root package name */
    public final u1 f23824j;

    /* renamed from: k, reason: collision with root package name */
    public final List f23825k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23826l;

    public j0(String str, String str2, String str3, long j10, Long l10, boolean z3, t1 t1Var, k2 k2Var, j2 j2Var, u1 u1Var, List list, int i) {
        this.f23817a = str;
        this.f23818b = str2;
        this.f23819c = str3;
        this.f23820d = j10;
        this.e = l10;
        this.f23821f = z3;
        this.f23822g = t1Var;
        this.f23823h = k2Var;
        this.i = j2Var;
        this.f23824j = u1Var;
        this.f23825k = list;
        this.f23826l = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qc.i0, java.lang.Object] */
    @Override // qc.l2
    public final i0 a() {
        Object obj = new Object();
        obj.f23794a = this.f23817a;
        obj.f23795b = this.f23818b;
        obj.f23796c = this.f23819c;
        obj.f23797d = this.f23820d;
        obj.e = this.e;
        obj.f23798f = this.f23821f;
        obj.f23799g = this.f23822g;
        obj.f23800h = this.f23823h;
        obj.i = this.i;
        obj.f23801j = this.f23824j;
        obj.f23802k = this.f23825k;
        obj.f23803l = this.f23826l;
        obj.f23804m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            j0 j0Var = (j0) ((l2) obj);
            if (this.f23817a.equals(j0Var.f23817a) && this.f23818b.equals(j0Var.f23818b)) {
                String str = j0Var.f23819c;
                String str2 = this.f23819c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f23820d == j0Var.f23820d) {
                        Long l10 = j0Var.e;
                        Long l11 = this.e;
                        if (l11 != null ? l11.equals(l10) : l10 == null) {
                            if (this.f23821f == j0Var.f23821f && this.f23822g.equals(j0Var.f23822g)) {
                                k2 k2Var = j0Var.f23823h;
                                k2 k2Var2 = this.f23823h;
                                if (k2Var2 != null ? k2Var2.equals(k2Var) : k2Var == null) {
                                    j2 j2Var = j0Var.i;
                                    j2 j2Var2 = this.i;
                                    if (j2Var2 != null ? j2Var2.equals(j2Var) : j2Var == null) {
                                        u1 u1Var = j0Var.f23824j;
                                        u1 u1Var2 = this.f23824j;
                                        if (u1Var2 != null ? u1Var2.equals(u1Var) : u1Var == null) {
                                            List list = j0Var.f23825k;
                                            List list2 = this.f23825k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f23826l == j0Var.f23826l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f23817a.hashCode() ^ 1000003) * 1000003) ^ this.f23818b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f23819c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f23820d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        Long l10 = this.e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f23821f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i12 ^ i) * 1000003) ^ this.f23822g.hashCode()) * 1000003;
        k2 k2Var = this.f23823h;
        if (k2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = k2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        j2 j2Var = this.i;
        if (j2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        u1 u1Var = this.f23824j;
        if (u1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = u1Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f23825k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f23826l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f23817a);
        sb2.append(", identifier=");
        sb2.append(this.f23818b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f23819c);
        sb2.append(", startedAt=");
        sb2.append(this.f23820d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f23821f);
        sb2.append(", app=");
        sb2.append(this.f23822g);
        sb2.append(", user=");
        sb2.append(this.f23823h);
        sb2.append(", os=");
        sb2.append(this.i);
        sb2.append(", device=");
        sb2.append(this.f23824j);
        sb2.append(", events=");
        sb2.append(this.f23825k);
        sb2.append(", generatorType=");
        return a.j(this.f23826l, "}", sb2);
    }
}