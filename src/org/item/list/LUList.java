package org.item.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LUList<I> {

	private List<I> recentQueue = new ArrayList<I>();
	private Set<I> itemList = new HashSet<I>();
	private int threshold = 10;
	private List<I> notUsedRecently = new ArrayList<I>();

	public boolean put(I item) {

		itemList.add(item);
		if (recentQueue.size() < threshold) {
			System.out.println("put : "+item);
			return recentQueue.add(item);

		} else {
			System.out.println("put : "+item);
			notUsedRecently.add(recentQueue.get(0));
			recentQueue.remove(0);
			return recentQueue.add(item);
		}
	}

	public I get(int index) {
		if (index < threshold) {
			if (recentQueue.size() < threshold) {
				I item = recentQueue.get(index);
				recentQueue.add(item);
				System.out.println("get : "+item);
				return item;
			} else {
				I item = recentQueue.get(index);
				notUsedRecently.add(recentQueue.get(0));
				recentQueue.remove(0);
				recentQueue.add(item);
				System.out.println("get : "+item);
				return item;
			}

		}
		return null;
	}

	public List<I> getRecentlyUsedList() {
		return recentQueue;
	}

	public List<I> getUnUsedList() {
		return notUsedRecently;
	}

	public List<I> getList() {
		return new ArrayList<I>(itemList);
	}

}
