package ya;
import fc.b;
import x.n;
import x.o;
import q.x;
import ya.fc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class fc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [sg.f, java.lang.Object, sg.t] */
    /* JADX WARN: Type inference failed for: r4v9, types: [sg.f, java.lang.Object, sg.t] */
    public static void a(long j10, sg.f fVar, int i, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j11;
        int i14;
        int i15 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 < i11) {
            for (int i16 = i10; i16 < i11; i16++) {
                if (((sg.h) arrayList4.get(i16)).b() < i15) {
                    x.n("Failed requirement.");
                    return;
                }
            }
            sg.h hVar = (sg.h) arrayList.get(i10);
            sg.h hVar2 = (sg.h) arrayList4.get(i11 - 1);
            if (i15 == hVar.b()) {
                int intValue = ((Number) arrayList5.get(i10)).intValue();
                int i17 = i10 + 1;
                sg.h hVar3 = (sg.h) arrayList4.get(i17);
                i12 = i17;
                i13 = intValue;
                hVar = hVar3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (hVar.e(i15) != hVar2.e(i15)) {
                int i18 = 1;
                for (int i19 = i12 + 1; i19 < i11; i19++) {
                    if (((sg.h) arrayList4.get(i19 - 1)).e(i15) != ((sg.h) arrayList4.get(i19)).e(i15)) {
                        i18++;
                    }
                }
                long j12 = 4;
                long j13 = (fVar.f25274v / j12) + j10 + 2 + (i18 * 2);
                fVar.L(i18);
                fVar.L(i13);
                for (int i20 = i12; i20 < i11; i20++) {
                    byte e = ((sg.h) arrayList4.get(i20)).e(i15);
                    if (i20 == i12 || e != ((sg.h) arrayList4.get(i20 - 1)).e(i15)) {
                        fVar.L(e & 255);
                    }
                }
                Object obj = new Object();
                int i21 = i12;
                while (i21 < i11) {
                    byte e8 = ((sg.h) arrayList4.get(i21)).e(i15);
                    int i22 = i21 + 1;
                    int i23 = i22;
                    while (true) {
                        if (i23 < i11) {
                            if (e8 != ((sg.h) arrayList4.get(i23)).e(i15)) {
                                break;
                            } else {
                                i23++;
                            }
                        } else {
                            i23 = i11;
                            break;
                        }
                    }
                    if (i22 == i23 && i15 + 1 == ((sg.h) arrayList4.get(i21)).b()) {
                        fVar.L(((Number) arrayList5.get(i21)).intValue());
                        arrayList3 = arrayList5;
                        j11 = j13;
                        i14 = i23;
                    } else {
                        fVar.L(((int) ((obj.f25274v / j12) + j13)) * (-1));
                        arrayList3 = arrayList5;
                        j11 = j13;
                        i14 = i23;
                        a(j11, obj, i15 + 1, arrayList, i21, i14, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j13 = j11;
                    i21 = i14;
                    arrayList5 = arrayList3;
                }
                fVar.B(obj);
                return;
            }
            int min = Math.min(hVar.b(), hVar2.b());
            int i24 = 0;
            for (int i25 = i15; i25 < min && hVar.e(i25) == hVar2.e(i25); i25++) {
                i24++;
            }
            long j14 = 4;
            long j15 = (fVar.f25274v / j14) + j10 + 2 + i24 + 1;
            fVar.L(-i24);
            fVar.L(i13);
            int i26 = i15 + i24;
            while (i15 < i26) {
                fVar.L(hVar.e(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i26 == ((sg.h) arrayList4.get(i12)).b()) {
                    fVar.L(((Number) arrayList5.get(i12)).intValue());
                    return;
                } else {
                    x.o("Check failed.");
                    return;
                }
            }
            Object obj2 = new Object();
            fVar.L(((int) ((obj2.f25274v / j14) + j15)) * (-1));
            a(j15, obj2, i26, arrayList4, i12, i11, arrayList5);
            fVar.B(obj2);
            return;
        }
        x.n("Failed requirement.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [sg.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static sg.l b(sg.h... r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.fc.b(sg.h[]):sg.l");
    }
}