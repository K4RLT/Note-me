package xa;
import q.l;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class x2 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public String f30706u;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f30708w;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a2 f30711z;

    /* renamed from: v, reason: collision with root package name */
    public int f30707v = 2;

    /* renamed from: x, reason: collision with root package name */
    public int f30709x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f30710y = Integer.MAX_VALUE;

    public x2(CharSequence charSequence, a2 a2Var) {
        this.f30711z = a2Var;
        this.f30708w = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10 = this.f30707v;
        if (i10 != 4) {
            int i11 = i10 - 1;
            String str = null;
            if (i10 != 0) {
                if (i11 == 0) {
                    return true;
                }
                if (i11 != 2) {
                    this.f30707v = 4;
                    int i12 = this.f30709x;
                    while (true) {
                        int i13 = this.f30709x;
                        if (i13 != -1) {
                            a2 a2Var = this.f30711z;
                            CharSequence charSequence = this.f30708w;
                            int G = a2Var.G(charSequence, i13);
                            if (G == -1) {
                                G = charSequence.length();
                                this.f30709x = -1;
                                i = -1;
                            } else {
                                i = G + 1;
                                this.f30709x = i;
                            }
                            if (i == i12) {
                                int i14 = i + 1;
                                this.f30709x = i14;
                                if (i14 > charSequence.length()) {
                                    this.f30709x = -1;
                                }
                            } else {
                                if (i12 < G) {
                                    charSequence.charAt(i12);
                                }
                                if (i12 < G) {
                                    charSequence.charAt(G - 1);
                                }
                                int i15 = this.f30710y;
                                if (i15 == 1) {
                                    G = charSequence.length();
                                    this.f30709x = -1;
                                    if (G > i12) {
                                        charSequence.charAt(G - 1);
                                    }
                                } else {
                                    this.f30710y = i15 - 1;
                                }
                                str = charSequence.subSequence(i12, G).toString();
                            }
                        } else {
                            this.f30707v = 3;
                            break;
                        }
                    }
                    this.f30706u = str;
                    if (this.f30707v != 3) {
                        this.f30707v = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        g5.l();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f30707v = 2;
            String str = this.f30706u;
            this.f30706u = null;
            return str;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
