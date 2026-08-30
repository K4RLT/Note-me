package p;
import o0.f0;

import java.util.List;

/* loaded from: classes.dex */
public final class j implements z1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f22181a;

    public j(p pVar) {
        this.f22181a = pVar;
    }

    @Override // z1.p0
    public final int a(z1.t tVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((z1.o0) list.get(0)).l(i));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((z1.o0) list.get(i10)).l(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // z1.p0
    public final int d(z1.t tVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((z1.o0) list.get(0)).n(i));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((z1.o0) list.get(i10)).n(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // z1.p0
    public final int f(z1.t tVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((z1.o0) list.get(0)).c(i));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((z1.o0) list.get(i10)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        z1.a1 a1Var;
        int i;
        z1.a1 a1Var2;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z9;
        int i17;
        int i18;
        int size = list.size();
        z1.a1[] a1VarArr = new z1.a1[size];
        List list2 = list;
        int size2 = list2.size();
        long j11 = 0;
        int i19 = 0;
        while (true) {
            a1Var = null;
            l lVar = null;
            i = 1;
            if (i19 >= size2) {
                break;
            }
            z1.o0 o0Var = (z1.o0) list.get(i19);
            Object H = o0Var.H();
            if (H instanceof l) {
                lVar = (l) H;
            }
            if (lVar != null && ((Boolean) lVar.f22196a.getValue()).booleanValue()) {
                a1VarArr[i19] = o0Var.z(j10);
                j11 = (r8.f31770v & 4294967295L) | (r8.f31769u << 32);
            }
            i19++;
        }
        int size3 = list2.size();
        for (int i20 = 0; i20 < size3; i20++) {
            z1.o0 o0Var2 = (z1.o0) list.get(i20);
            if (a1VarArr[i20] == null) {
                a1VarArr[i20] = o0Var2.z(j10);
            }
        }
        if (r0Var.j0()) {
            i14 = (int) (j11 >> 32);
        } else {
            if (size == 0) {
                a1Var2 = null;
            } else {
                a1Var2 = a1VarArr[0];
                int i21 = size - 1;
                if (i21 != 0) {
                    if (a1Var2 != null) {
                        i10 = a1Var2.f31769u;
                    } else {
                        i10 = 0;
                    }
                    jf.b bVar = new jf.b(1, i21, 1);
                    int i22 = bVar.f19190v;
                    int i23 = bVar.f19191w;
                    if (i23 <= 0 ? 1 >= i22 : 1 <= i22) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i11 = 1;
                    } else {
                        i11 = i22;
                    }
                    while (z3) {
                        if (i11 == i22) {
                            if (z3) {
                                i12 = i11;
                                z3 = false;
                            } else {
                                l4.a.c();
                                return null;
                            }
                        } else {
                            i12 = i11 + i23;
                            z3 = z3;
                        }
                        z1.a1 a1Var3 = a1VarArr[i11];
                        if (a1Var3 != null) {
                            i13 = a1Var3.f31769u;
                        } else {
                            i13 = 0;
                        }
                        if (i10 < i13) {
                            a1Var2 = a1Var3;
                            i11 = i12;
                            i10 = i13;
                        } else {
                            i11 = i12;
                        }
                    }
                }
            }
            if (a1Var2 != null) {
                i14 = a1Var2.f31769u;
            } else {
                i14 = 0;
            }
        }
        if (r0Var.j0()) {
            i15 = (int) (j11 & 4294967295L);
        } else {
            if (size != 0) {
                a1Var = a1VarArr[0];
                int i24 = size - 1;
                if (i24 != 0) {
                    if (a1Var != null) {
                        i16 = a1Var.f31770v;
                    } else {
                        i16 = 0;
                    }
                    jf.b bVar2 = new jf.b(1, i24, 1);
                    int i25 = bVar2.f19190v;
                    int i26 = bVar2.f19191w;
                    if (i26 <= 0 ? 1 >= i25 : 1 <= i25) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        i = i25;
                    }
                    while (z9) {
                        if (i == i25) {
                            if (z9) {
                                i17 = i;
                                z9 = false;
                            } else {
                                l4.a.c();
                                return null;
                            }
                        } else {
                            i17 = i + i26;
                            z9 = z9;
                        }
                        z1.a1 a1Var4 = a1VarArr[i];
                        if (a1Var4 != null) {
                            i18 = a1Var4.f31770v;
                        } else {
                            i18 = 0;
                        }
                        i = i17;
                        if (i16 < i18) {
                            a1Var = a1Var4;
                            i16 = i18;
                        }
                    }
                }
            }
            if (a1Var != null) {
                i15 = a1Var.f31770v;
            } else {
                i15 = 0;
            }
        }
        if (!r0Var.j0()) {
            this.f22181a.f22221b.setValue(new y2.l((i14 << 32) | (i15 & 4294967295L)));
        }
        return r0Var.u0(i14, i15, qe.t.f24024u, new f0(a1VarArr, this, i14, i15));
    }

    @Override // z1.p0
    public final int i(z1.t tVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((z1.o0) list.get(0)).Z(i));
            int i10 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((z1.o0) list.get(i10)).Z(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
