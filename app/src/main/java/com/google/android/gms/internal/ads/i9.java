package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7050a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7051b;

    /* renamed from: c, reason: collision with root package name */
    public long f7052c;

    /* renamed from: d, reason: collision with root package name */
    public int f7053d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7054f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7055g;

    public i9(List list) {
        this.f7050a = 0;
        this.f7054f = list;
        this.f7055g = new i3[list.size()];
        this.f7052c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        switch (this.f7050a) {
            case 0:
                int i = 0;
                while (true) {
                    i3[] i3VarArr = (i3[]) this.f7055g;
                    if (i < i3VarArr.length) {
                        ea eaVar = (ea) ((List) this.f7054f).get(i);
                        faVar.a();
                        faVar.b();
                        i3 A = p2Var.A(faVar.f5998d, 3);
                        rv1 rv1Var = new rv1();
                        faVar.b();
                        rv1Var.f10296a = faVar.e;
                        rv1Var.d("video/mp2t");
                        rv1Var.e("application/dvbsubs");
                        rv1Var.f10310q = Collections.singletonList(eaVar.f5625b);
                        rv1Var.f10299d = eaVar.f5624a;
                        A.e(new mw1(rv1Var));
                        i3VarArr[i] = A;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                faVar.a();
                faVar.b();
                i3 A2 = p2Var.A(faVar.f5998d, 5);
                this.f7055g = A2;
                rv1 rv1Var2 = new rv1();
                faVar.b();
                rv1Var2.f10296a = faVar.e;
                rv1Var2.d("video/mp2t");
                rv1Var2.e("application/id3");
                A2.e(new mw1(rv1Var2));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void b() {
        boolean z3;
        int i;
        boolean z9;
        switch (this.f7050a) {
            case 0:
                if (this.f7051b) {
                    if (this.f7052c != -9223372036854775807L) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    b80.K(z3);
                    for (i3 i3Var : (i3[]) this.f7055g) {
                        i3Var.c(this.f7052c, 1, this.e, 0, null);
                    }
                    this.f7051b = false;
                    return;
                }
                return;
            default:
                ((i3) this.f7055g).getClass();
                if (this.f7051b && (i = this.f7053d) != 0 && this.e == i) {
                    if (this.f7052c != -9223372036854775807L) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    b80.K(z9);
                    ((i3) this.f7055g).c(this.f7052c, 1, this.f7053d, 0, null);
                    this.f7051b = false;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(xk0 xk0Var) {
        boolean z3;
        boolean z9;
        switch (this.f7050a) {
            case 0:
                if (this.f7051b) {
                    if (this.f7053d == 2) {
                        if (xk0Var.B() == 0) {
                            z9 = false;
                        } else {
                            if (xk0Var.K() != 32) {
                                this.f7051b = false;
                            }
                            this.f7053d--;
                            z9 = this.f7051b;
                        }
                        if (!z9) {
                            return;
                        }
                    }
                    if (this.f7053d == 1) {
                        if (xk0Var.B() == 0) {
                            z3 = false;
                        } else {
                            if (xk0Var.K() != 0) {
                                this.f7051b = false;
                            }
                            this.f7053d--;
                            z3 = this.f7051b;
                        }
                        if (!z3) {
                            return;
                        }
                    }
                    int i = xk0Var.f12581b;
                    int B = xk0Var.B();
                    for (i3 i3Var : (i3[]) this.f7055g) {
                        xk0Var.E(i);
                        i3Var.a(B, xk0Var);
                    }
                    this.e += B;
                    return;
                }
                return;
            default:
                ((i3) this.f7055g).getClass();
                if (this.f7051b) {
                    int B2 = xk0Var.B();
                    int i10 = this.e;
                    if (i10 < 10) {
                        int min = Math.min(B2, 10 - i10);
                        byte[] bArr = xk0Var.f12580a;
                        int i11 = xk0Var.f12581b;
                        xk0 xk0Var2 = (xk0) this.f7054f;
                        System.arraycopy(bArr, i11, xk0Var2.f12580a, this.e, min);
                        if (this.e + min == 10) {
                            xk0Var2.E(0);
                            if (xk0Var2.K() == 73 && xk0Var2.K() == 68 && xk0Var2.K() == 51) {
                                xk0Var2.G(3);
                                this.f7053d = xk0Var2.g() + 10;
                            } else {
                                x21.F("Id3Reader", "Discarding invalid ID3 tag");
                                this.f7051b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(B2, this.f7053d - this.e);
                    ((i3) this.f7055g).a(min2, xk0Var);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        switch (this.f7050a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f7051b = true;
                    this.f7052c = j10;
                    this.e = 0;
                    this.f7053d = 2;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.f7051b = true;
                    this.f7052c = j10;
                    this.f7053d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        switch (this.f7050a) {
            case 0:
                this.f7051b = false;
                this.f7052c = -9223372036854775807L;
                return;
            default:
                this.f7051b = false;
                this.f7052c = -9223372036854775807L;
                return;
        }
    }

    public i9() {
        this.f7050a = 1;
        this.f7054f = new xk0(10);
        this.f7052c = -9223372036854775807L;
    }
}
