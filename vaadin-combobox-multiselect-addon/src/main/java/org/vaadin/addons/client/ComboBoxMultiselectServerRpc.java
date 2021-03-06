/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vaadin.addons.client;

import java.util.Set;

import com.vaadin.shared.communication.ServerRpc;

/**
 * Client to server RPC interface for ComboBoxMultiselect.
 *
 * @since 8.0
 */
public interface ComboBoxMultiselectServerRpc extends ServerRpc {
	/**
	 * Create a new item in the combo box. This method can only be used when the
	 * ComboBoxMultiselect is configured to allow the creation of new items by
	 * the user.
	 *
	 * @param itemValue
	 *            user entered string value for the new item
	 */
	public void createNewItem(String itemValue);

	/**
	 * Sets the filter to use.
	 *
	 * @param filter
	 *            filter string interpreted according to the current filtering
	 *            mode
	 */
	public void setFilter(String filter);

	/**
	 * Updates the selected items based on their keys.
	 *
	 * @param addedItemKeys
	 *            the item keys added to selection
	 * @param removedItemKeys
	 *            the item keys removed from selection
	 * @param sortingNeeded
	 *            is sorting needed before sending data back to client
	 */
	void updateSelection(Set<String> addedItemKeys, Set<String> removedItemKeys, boolean sortingNeeded);

	/**
	 * Send the blur event.
	 */
	void blur();

	/**
	 * Select all.
	 */
	void selectAll(String filter);

	/**
	 * Clear.
	 */
	public void clear(String filter);
}
