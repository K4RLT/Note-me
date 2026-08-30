package c4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class c0 implements Spannable {

    /* renamed from: u, reason: collision with root package name */
    public boolean f3825u = false;

    /* renamed from: v, reason: collision with root package name */
    public Spannable f3826v;

    public c0(Spannable spannable) {
        this.f3826v = spannable;
    }

    public final void a() {
        va.t tVar;
        Spannable spannable = this.f3826v;
        if (!this.f3825u) {
            if (Build.VERSION.SDK_INT < 28) {
                tVar = new va.t(8);
            } else {
                tVar = new va.t(8);
            }
            if (tVar.b(spannable)) {
                this.f3826v = new SpannableString(spannable);
            }
        }
        this.f3825u = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f3826v.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f3826v.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f3826v.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f3826v.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f3826v.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f3826v.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        return this.f3826v.getSpans(i, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3826v.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        return this.f3826v.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f3826v.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        a();
        this.f3826v.setSpan(obj, i, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return this.f3826v.subSequence(i, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3826v.toString();
    }
}
