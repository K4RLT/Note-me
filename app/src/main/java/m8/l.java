package m8;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f20724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20726c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20727d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20728f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20729g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20730h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f20731j;

    /* renamed from: k, reason: collision with root package name */
    public final String f20732k;

    /* renamed from: l, reason: collision with root package name */
    public final String f20733l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f20724a = num;
        this.f20725b = str;
        this.f20726c = str2;
        this.f20727d = str3;
        this.e = str4;
        this.f20728f = str5;
        this.f20729g = str6;
        this.f20730h = str7;
        this.i = str8;
        this.f20731j = str9;
        this.f20732k = str10;
        this.f20733l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f20724a.equals(((l) aVar).f20724a)) {
                    if (this.f20725b.equals(((l) aVar).f20725b)) {
                        if (this.f20726c.equals(((l) aVar).f20726c)) {
                            if (this.f20727d.equals(((l) aVar).f20727d)) {
                                if (this.e.equals(((l) aVar).e)) {
                                    if (this.f20728f.equals(((l) aVar).f20728f)) {
                                        if (this.f20729g.equals(((l) aVar).f20729g)) {
                                            if (this.f20730h.equals(((l) aVar).f20730h)) {
                                                if (this.i.equals(((l) aVar).i)) {
                                                    if (this.f20731j.equals(((l) aVar).f20731j)) {
                                                        if (this.f20732k.equals(((l) aVar).f20732k)) {
                                                            if (this.f20733l.equals(((l) aVar).f20733l)) {
                                                                return true;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f20724a.hashCode() ^ 1000003) * 1000003) ^ this.f20725b.hashCode()) * 1000003) ^ this.f20726c.hashCode()) * 1000003) ^ this.f20727d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f20728f.hashCode()) * 1000003) ^ this.f20729g.hashCode()) * 1000003) ^ this.f20730h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.f20731j.hashCode()) * 1000003) ^ this.f20732k.hashCode()) * 1000003) ^ this.f20733l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f20724a);
        sb2.append(", model=");
        sb2.append(this.f20725b);
        sb2.append(", hardware=");
        sb2.append(this.f20726c);
        sb2.append(", device=");
        sb2.append(this.f20727d);
        sb2.append(", product=");
        sb2.append(this.e);
        sb2.append(", osBuild=");
        sb2.append(this.f20728f);
        sb2.append(", manufacturer=");
        sb2.append(this.f20729g);
        sb2.append(", fingerprint=");
        sb2.append(this.f20730h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.f20731j);
        sb2.append(", mccMnc=");
        sb2.append(this.f20732k);
        sb2.append(", applicationBuild=");
        return a5.a.k(sb2, this.f20733l, "}");
    }
}
