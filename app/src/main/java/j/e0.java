package j;
import e0.a;
import j.e0;
import q.o;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import c2.c3;
import com.daren.scraply.R;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e0 extends v3.b implements View.OnClickListener {
    public static final /* synthetic */ int R = 0;
    public final int B;
    public final int C;
    public final LayoutInflater D;
    public final SearchView E;
    public final SearchableInfo F;
    public final Context G;
    public final WeakHashMap H;
    public final int I;
    public int J;
    public ColorStateList K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;

    public e0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f27378v = true;
        this.f27379w = null;
        this.f27377u = false;
        this.f27380x = -1;
        this.f27381y = new c3(this);
        this.f27382z = new v3.a(this);
        this.C = suggestionRowLayout;
        this.B = suggestionRowLayout;
        this.D = (LayoutInflater) context.getSystemService("layout_inflater");
        this.J = 1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.E = searchView;
        this.F = searchableInfo;
        this.I = searchView.getSuggestionCommitIconResId();
        this.G = context;
        this.H = weakHashMap;
    }

    public static String l(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // v3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // v3.b
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.L = cursor.getColumnIndex("suggest_text_1");
                this.M = cursor.getColumnIndex("suggest_text_2");
                this.N = cursor.getColumnIndex("suggest_text_2_url");
                this.O = cursor.getColumnIndex("suggest_icon_1");
                this.P = cursor.getColumnIndex("suggest_icon_2");
                this.Q = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // v3.b
    public final String e(Cursor cursor) {
        String l10;
        String l11;
        if (cursor != null) {
            String l12 = l(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (l12 != null) {
                return l12;
            }
            SearchableInfo searchableInfo = this.F;
            if (searchableInfo.shouldRewriteQueryFromData() && (l11 = l(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return l11;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (l10 = l(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return l10;
            }
            return null;
        }
        return null;
    }

    @Override // v3.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.D.inflate(this.C, viewGroup, false);
            if (inflate != null) {
                ((d0) inflate.getTag()).f18624a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // v3.b, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.D.inflate(this.B, viewGroup, false);
            inflate.setTag(new d0(inflate));
            ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.I);
            ((d0) inflate.getTag()).f18624a.setText(e.toString());
            return inflate;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public final Drawable i(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.G.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            g5.o(uri, "Single path segment is not a resource ID: ");
                            return null;
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        g5.o(uri, "More than two path segments: ");
                        return null;
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    g5.o(uri, "No resource found for: ");
                    return null;
                }
                g5.o(uri, "No path: ");
                return null;
            } catch (PackageManager.NameNotFoundException unused2) {
                g5.o(uri, "No package found for authority: ");
                return null;
            }
        }
        g5.o(uri, "No authority: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable j(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e0.j(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor k(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.G.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f27379w;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f27379w;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.E.j((CharSequence) tag);
        }
    }
}
