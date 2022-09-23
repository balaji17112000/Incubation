package operations;

import java.util.*;
import util.*;

public class HashMapOperations {
	public HashMap getHash() {
		HashMap<Object,Object> hash = new HashMap<Object,Object>(10);
		return  hash;
	}
	public <V> int getLength(Map<Object,V> hash)throws KeyException {
		Check.nullCheck(hash);
		return hash.size();
	}
	public <K,V> boolean keyExist(Map<K,V> hash,K key)throws KeyException {
		Check.nullCheck(hash);
		if(!hash.containsKey(key)) {
			return false;
		}
		return true;
	}
	public <K,V> boolean valueExist(Map<K,V> hash,V value)throws KeyException {
		Check.nullCheck(hash);
		if(!hash.containsValue(value)) {
			return false;
		}
		return true;
	}
	public <K,V> void changeAllValue(Map<K,V> hash,String str) throws KeyException{
		Check.nullCheck(hash);
		hash.replaceAll((K,V)->V=(V)str);
	}
	public <K,V> V getValue(Map<K,V> hash,K key) throws KeyException{
		Check.nullCheck(hash);
		return hash.getOrDefault(key,(V) "Zoho");
	}
	public <K,V> void deleteKey(Map<K,V> hash,K key)throws KeyException {
		Check.nullCheck(hash);
		hash.remove(key);
	}
	public <K,V> void deleteKey(Map<K,V> hash,K key,V value) throws KeyException {
		Check.nullCheck(hash);
		hash.remove(key,value);
	}
	public <K,V> void replaceValue(Map<K,V> hash,K key,V value) throws KeyException {
		Check.nullCheck(hash);
		hash.replace(key,value);
	}
	public <K,V> void replaceValue(Map<K,V> hash,K key,V value,V value1)throws KeyException  {
		Check.nullCheck(hash);
		hash.replace(key,value,value1);
	}
	public <K,V> HashMap<K,V> addHash(Map<K,V> hash1,Map<K,V> hash2) throws KeyException {
		Check.nullCheck(hash1);
		Check.nullCheck(hash2);
		hash1.putAll(hash2);
		return (HashMap<K, V>) hash1;
	}
	public <K,V> void deleteHash(Map<K,V> hash)throws KeyException  {
		Check.nullCheck(hash);
		hash.clear();
	}
}