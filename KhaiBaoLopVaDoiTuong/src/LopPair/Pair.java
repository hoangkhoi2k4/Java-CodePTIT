/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopPair;

/**
 *
 * @author Hoang Van Khoi
 */
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair of(K key, V value) {
        return new Pair<>(key, value);
    }

    public boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime() {
        if (checkPrime(Integer.parseInt(key.toString())) && checkPrime(Integer.parseInt(value.toString()))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}