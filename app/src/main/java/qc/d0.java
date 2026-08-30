package qc;

import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23741a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23743c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23744d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23745f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23746g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23747h;
    public final List i;

    public d0(int i, String str, int i10, int i11, long j10, long j11, long j12, String str2, List list) {
        this.f23741a = i;
        this.f23742b = str;
        this.f23743c = i10;
        this.f23744d = i11;
        this.e = j10;
        this.f23745f = j11;
        this.f23746g = j12;
        this.f23747h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            d0 d0Var = (d0) ((o1) obj);
            if (this.f23741a == d0Var.f23741a && this.f23742b.equals(d0Var.f23742b) && this.f23743c == d0Var.f23743c && this.f23744d == d0Var.f23744d && this.e == d0Var.e && this.f23745f == d0Var.f23745f && this.f23746g == d0Var.f23746g) {
                String str = d0Var.f23747h;
                String str2 = this.f23747h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = d0Var.i;
                    List list2 = this.i;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f23741a ^ 1000003) * 1000003) ^ this.f23742b.hashCode()) * 1000003) ^ this.f23743c) * 1000003) ^ this.f23744d) * 1000003;
        long j10 = this.e;
        int i = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f23745f;
        int i10 = (i ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f23746g;
        int i11 = (i10 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i12 = 0;
        String str = this.f23747h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 ^ hashCode) * 1000003;
        List list = this.i;
        if (list != null) {
            i12 = list.hashCode();
        }
        return i13 ^ i12;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f23741a + ", processName=" + this.f23742b + ", reasonCode=" + this.f23743c + ", importance=" + this.f23744d + ", pss=" + this.e + ", rss=" + this.f23745f + ", timestamp=" + this.f23746g + ", traceFile=" + this.f23747h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
