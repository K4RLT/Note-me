package n2;

import java.text.CharacterIterator;
import q.x;

/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f21110u;

    /* renamed from: v, reason: collision with root package name */
    public final int f21111v;

    /* renamed from: w, reason: collision with root package name */
    public int f21112w = 0;

    public b(CharSequence charSequence, int i) {
        this.f21110u = charSequence;
        this.f21111v = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f21112w;
        if (i == this.f21111v) {
            return (char) 65535;
        }
        return this.f21110u.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f21112w = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f21111v;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f21112w;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f21111v;
        if (i == 0) {
            this.f21112w = i;
            return (char) 65535;
        }
        int i10 = i - 1;
        this.f21112w = i10;
        return this.f21110u.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f21112w + 1;
        this.f21112w = i;
        int i10 = this.f21111v;
        if (i >= i10) {
            this.f21112w = i10;
            return (char) 65535;
        }
        return this.f21110u.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f21112w;
        if (i <= 0) {
            return (char) 65535;
        }
        int i10 = i - 1;
        this.f21112w = i10;
        return this.f21110u.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i <= this.f21111v && i >= 0) {
            this.f21112w = i;
            return current();
        }
        x.n("invalid position");
        return (char) 0;
    }
}
