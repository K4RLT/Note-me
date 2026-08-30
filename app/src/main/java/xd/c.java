package xd;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f30741a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f30742b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f30743c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f30744d;
    public final Long e;

    public c(Boolean bool, Double d2, Integer num, Integer num2, Long l10) {
        this.f30741a = bool;
        this.f30742b = d2;
        this.f30743c = num;
        this.f30744d = num2;
        this.e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (l.a(this.f30741a, cVar.f30741a) && l.a(this.f30742b, cVar.f30742b) && l.a(this.f30743c, cVar.f30743c) && l.a(this.f30744d, cVar.f30744d) && l.a(this.e, cVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Boolean bool = this.f30741a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i10 = hashCode * 31;
        Double d2 = this.f30742b;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.f30743c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num2 = this.f30744d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l10 = this.e;
        if (l10 != null) {
            i = l10.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f30741a + ", sessionSamplingRate=" + this.f30742b + ", sessionRestartTimeout=" + this.f30743c + ", cacheDuration=" + this.f30744d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
