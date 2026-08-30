package s;

import c3.a0;
import y2.m;
import ya.pb;

/* loaded from: classes.dex */
public final class e implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24834a;

    public e(long j10) {
        this.f24834a = j10;
    }

    @Override // c3.a0
    public final long a(y2.k kVar, long j10, m mVar, long j11) {
        boolean z3;
        int i = kVar.f30809a + ((int) (this.f24834a >> 32));
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j10 >> 32);
        if (mVar == m.f30814u) {
            z3 = true;
        } else {
            z3 = false;
        }
        return (pb.a(i, i10, i11, z3) << 32) | (pb.a(kVar.f30810b + ((int) (r1 & 4294967295L)), (int) (j11 & 4294967295L), (int) (j10 & 4294967295L), true) & 4294967295L);
    }
}
