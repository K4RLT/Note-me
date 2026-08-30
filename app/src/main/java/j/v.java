package j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SearchView f18683u;

    public v(SearchView searchView) {
        this.f18683u = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j10) {
        this.f18683u.h(i);
    }
}
