/*
 * InventoryItem.java
 *
 * Created on 10 ������� 2007, 4:42 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package advanceTopics.products.products;

/**
 * @author MAtthaiakis Stergios
 */
public class InventoryItem
{
	//public int partNumber;
	public long partNumber;
	private String description;

	public InventoryItem(long n, String d)
	{
		partNumber = n;
		description = d;
	}

	public InventoryItem()
	{
		partNumber = 0;
		description = "N/A";
	}

	public long getPartNumber()
	{
		return partNumber;
	}
}